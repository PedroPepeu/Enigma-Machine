package enigma.list_config;

public class CircularLinkedList {

    private CircularListNode sentinel;
    private CircularListNode next;
    private CircularListNode previous;
    private int size;

    public CircularLinkedList() {
        sentinel = new CircularListNode(' ', null, null); // why can`t be null ????
        this.sentinel.setNext(this.sentinel);
        this.sentinel.setPrevious(this.sentinel);
        
        this.size = 0;
    }

    public void addFirst(char letter) {
        CircularListNode currentHead = this.sentinel.getNext();
        CircularListNode newHead = new CircularListNode(letter, this.sentinel, currentHead);
        currentHead.setPrevious(newHead);
        this.sentinel.setNext(newHead);
        setSize(size() + 1);
    }

    public void addLast(char letter) {
        CircularListNode currentTail = this.sentinel.getPrevious();
        CircularListNode newTail = new CircularListNode(letter, currentTail, this.sentinel);
        currentTail.setNext(newTail);
        this.sentinel.setPrevious(newTail);
        setSize(size() + 1);
    }

    public void reverse() {
        if(size() < 2) return;

        CircularListNode previous = this.sentinel.getNext();
        CircularListNode current = previous.getNext();

        while(current != this.sentinel) {
            CircularListNode next = current.getNext();
            current.setNext(previous);
            current.setPrevious(next);
            previous = current;
            current = next;
        }

        this.sentinel.getNext().setPrevious(this.sentinel.getNext().getNext());
        this.sentinel.getNext().setNext(this.sentinel);
        
        this.sentinel.setPrevious(this.sentinel.getNext());
        this.sentinel.setNext(previous);
    }

    public void delete(CircularListNode nodeDelete) {
        if(nodeDelete == this.sentinel) return;

        if(nodeDelete == this.sentinel.getNext()) this.sentinel.setNext(nodeDelete.getNext());

        if(nodeDelete == this.sentinel.getPrevious()) this.sentinel.setPrevious(nodeDelete.getPrevious());

        if(nodeDelete.getPrevious() != this.sentinel) nodeDelete.getPrevious().setNext(nodeDelete.getNext());

        if(nodeDelete.getNext() != this.sentinel) nodeDelete.getNext().setPrevious(nodeDelete.getPrevious());

        setSize(size() - 1);
    }

    public CircularLinkedList copy() {
        CircularLinkedList copyCircularLinkedList = new CircularLinkedList();

        CircularListNode currentOriginalCircularLinkedList = this.sentinel.getNext();
        while(currentOriginalCircularLinkedList != this.sentinel) {
            copyCircularLinkedList.addLast(currentOriginalCircularLinkedList.getLetter());
            currentOriginalCircularLinkedList = currentOriginalCircularLinkedList.getNext();
        }
        
        return copyCircularLinkedList;
    }

    public int get(int index) throws Exception {
        try {
            index = index % size();
            CircularListNode current = this.sentinel.getNext();
            for(int i = 0; i < index; i++) {
                current = current.getNext();
                if(current == this.sentinel) current = current.getNext();
            }
            return current.getLetter();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("List is empty");
            throw e;
        }
    }

    public int get(CircularListNode currentNode, int index) {
        for(int i = 0; i < index; i++) {
            currentNode = getSuccessor(currentNode);
        }
        return currentNode.getLetter();
    }

    public CircularListNode getSuccessor(CircularListNode currentNode) {
        try {
            if(isEmpty()) throw new IndexOutOfBoundsException("Circular list is empty");
            CircularListNode successor = currentNode.getNext();
            if(successor == this.sentinel) successor = successor.getNext();
            return successor;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Circular list is empty");
            throw e;
        }
    }

    public CircularListNode search(char elem) {
        CircularListNode current = this.sentinel.getNext();

        while(current != this.sentinel) {
            if(current.getLetter() == elem) return current;
            current = current.getNext();
        }
        return null;
    }

    public int size() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return this.sentinel.getNext() == this.sentinel;
    }
    
    public CircularListNode getNext() {
        return this.next;
    }

    public void setNext(CircularListNode next) {
        this.next = next;
    }

    public CircularListNode getPrevious() {
        return this.previous;
    }

    public void setPrevious(CircularListNode previous) {
        this.previous = previous;
    }

    public CircularListNode getTail() {
        return this.sentinel.getPrevious();
    }

    public CircularListNode getSentinel() {
        return sentinel;
    }

    public void setSentinel(CircularListNode sentinel) {
        this.sentinel = sentinel;
    }

    public CircularListNode getHead() {
        return this.sentinel.getNext();
    }
    
}
