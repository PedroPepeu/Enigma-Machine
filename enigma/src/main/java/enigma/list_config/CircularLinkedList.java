package enigma.list_config;

public class CircularLinkedList<V> {

    private CircularListNode<V> sentinel;
    private int size;

    public CircularLinkedList() {
        sentinel = new CircularListNode<>(null, null, null); // why can`t be null ????
        this.sentinel.setNext(this.sentinel);
        this.sentinel.setPrevious(this.sentinel);
        
        this.size = 0;
    }

    public void addFirst(V letter) {
        CircularListNode<V> currentHead = this.sentinel.getNext();
        CircularListNode<V> newHead = new CircularListNode<>(letter, this.sentinel, currentHead);
        currentHead.setPrevious(newHead);
        this.sentinel.setNext(newHead);
        setSize(size() + 1);
    }

    public void addLast(V letter) {
        CircularListNode<V> currentTail = this.sentinel.getPrevious();
        CircularListNode<V> newTail = new CircularListNode<>(letter, currentTail, this.sentinel);
        currentTail.setNext(newTail);
        this.sentinel.setPrevious(newTail);
        setSize(size() + 1);
    }

    public void reverse() {
        if(size() < 2) return;

        CircularListNode<V> previous = this.sentinel.getNext();
        CircularListNode<V> current = previous.getNext();

        while(current != this.sentinel) {
            CircularListNode<V> next = current.getNext();
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

    public void delete(CircularListNode<V> nodeDelete) {
        if(nodeDelete == this.sentinel) return;

        if(nodeDelete == this.sentinel.getNext()) this.sentinel.setNext(nodeDelete.getNext());

        if(nodeDelete == this.sentinel.getPrevious()) this.sentinel.setPrevious(nodeDelete.getPrevious());

        if(nodeDelete.getPrevious() != this.sentinel) nodeDelete.getPrevious().setNext(nodeDelete.getNext());

        if(nodeDelete.getNext() != this.sentinel) nodeDelete.getNext().setPrevious(nodeDelete.getPrevious());

        setSize(size() - 1);
    }

    public CircularLinkedList<V> copy() {
        CircularLinkedList<V> copyCircularLinkedList = new CircularLinkedList<>();

        CircularListNode<V> currentOriginalCircularLinkedList = this.sentinel.getNext();
        while(currentOriginalCircularLinkedList != this.sentinel) {
            copyCircularLinkedList.addLast(currentOriginalCircularLinkedList.getLetter());
            currentOriginalCircularLinkedList = currentOriginalCircularLinkedList.getNext();
        }
        
        return copyCircularLinkedList;
    }

    public V get(int index) throws Exception {
        try {
            index = index % size();
            CircularListNode<V> current = this.sentinel.getNext();
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

    public V get(CircularListNode<V> currentNode, int index) {
        for(int i = 0; i < index; i++) {
            currentNode = getSuccessor(currentNode);
        }
        return currentNode.getLetter();
    }

    public CircularListNode<V> getSuccessor(CircularListNode<V> currentNode) {
        try {
            if(isEmpty()) throw new IndexOutOfBoundsException("Circular list is empty");
            CircularListNode<V> successor = currentNode.getNext();
            if(successor == this.sentinel) successor = successor.getNext();
            return successor;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Circular list is empty");
            throw e;
        }
    }

    public CircularListNode<V> search(V elem) {
        CircularListNode<V> current = this.sentinel.getNext();

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
    
    public CircularListNode<V> getNext() {
        return this.next;
    }

    public void setNext(CircularListNode<V> next) {
        this.next = next;
    }

    public CircularListNode<V> getPrevious() {
        return this.previous;
    }

    public void setPrevious(CircularListNode<V> previous) {
        this.previous = previous;
    }

    public CircularListNode<V> getTail() {
        return this.sentinel.getPrevious();
    }

    public CircularListNode<V> getSentinel() {
        return sentinel;
    }

    public void setSentinel(CircularListNode<V> sentinel) {
        this.sentinel = sentinel;
    }

    public CircularListNode<V> getHead() {
        return this.sentinel.getNext();
    }
    
}
