package enigma.list_config;

public class CircularListNode<V> {
    
    private V letter;
    private CircularListNode<V> previous;
    private CircularListNode<V> next;

    public CircularListNode(V letter, CircularListNode<V> previous, CircularListNode<V> next) {
        this.letter = letter;
        this.next = next;
        this.previous = previous;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(obj instanceof CircularListNode<?>) {
            CircularListNode<?> other = (CircularListNode<?>) obj;
            return this.value.equals(other.value);
        }

        return false;
    }

    public char toChar() {
        return this.letter.toString();
    }

    public void setPrevious(CircularListNode<V> previous) {
        this.previous = previous;
    }

    public CircularListNode<V> getPrevious() {
        return this.previous;
    }

    public void setNext(CircularListNode<V> next) {
        this.next = next;
    }

    public CircularListNode<V> getNext() {
        return this.next;
    }

    public V getLetter() {
        return letter;
    }

    public void setLetter(V letter) {
        this.letter = letter;
    }
    
}