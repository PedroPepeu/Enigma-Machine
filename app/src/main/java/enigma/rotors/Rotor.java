package enigma.rotors;

import enigma.list_config.*;

public class Rotor {

    private CircularLinkedList rotor = new CircularLinkedList();
    private CircularListNode currentLetter;
    private char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public Rotor() {
        setCurrentLetter(getRotor().getHead());
    }

    public void configRotor() {
        for(int i = 0; i < this.alphabet.length; i++) {
            this.rotor.addFirst(this.alphabet[i]);
        }
    }

    public void roll() {
        this.currentLetter = getRotor().getNext();
    }

    public void reset() {
        this.currentLetter = getRotor().getHead();
    }

    public boolean lastLetter() {
        return this.currentLetter.getLetter() == 'Z';
    }

    public char position() {
        return this.currentLetter.getLetter();
    }

    public CircularLinkedList getRotor() {
        return rotor;
    }

    public void setRotor(CircularLinkedList rotor) {
        this.rotor = rotor;
    }


    public char[] getAlphabet() {
        return alphabet;
    }


    public void setAlphabet(char[] alphabet) {
        this.alphabet = alphabet;
    }

    public CircularListNode getCurrentLetter() {
        return currentLetter;
    }

    public void setCurrentLetter(CircularListNode currentLetter) {
        this.currentLetter = currentLetter;
    }
    
}
