package enigma.list_config;

public class CircularListNode {
    
    private char letter;
    private CircularListNode previous;
    private CircularListNode next;

    public CircularListNode(char letter, CircularListNode previous, CircularListNode next) {
        this.letter = letter;
        this.next = next;
        this.previous = previous;
    }

    public void setPrevious(CircularListNode previous) {
        this.previous = previous;
    }

    public CircularListNode getPrevious() {
        return this.previous;
    }

    public void setNext(CircularListNode next) {
        this.next = next;
    }

    public CircularListNode getNext() {
        return this.next;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }
    
}