package enigma.rotors;

public class RotorsAssociation {
    
    Rotor rotorA = new Rotor();
    Rotor rotorB = new Rotor();
    Rotor rotorC = new Rotor();

    public RotorsAssociation() {
        
    }

    public void resetRolls() {
        this.rotorA.reset();
        this.rotorB.reset();
        this.rotorC.reset();
    }

    public char letterRollA() {
        return this.letterRollA.position();
    }

    public char letterRollB() {
        return this.letterRollB.position();
    }

    public char letterRollC() {
        return this.letterRollC.position();
    }

    @Override
    public void rollAll() {
        if(this.this.rotorA.lastLetter()) {
            if(this.rotorB.lastLetter()) this.rotorC.roll();
            this.rotorB.roll();
        } 
        this.rotorA.roll();
    }

    public void setRotorA(CircularLinkedList<V> rotorA) {
        this.rotorA = rotorA;
    }

    public CircularLinkedList<V> getRotorA() {
        return rotorA;
    }

    public void setRotorB(CircularLinkedList<V> rotorB) {
        this.rotorB = rotorB;
    }

    public CircularLinkedList<V> getRotorB() {
        return rotorB;
    }

    public void setRotorC(CircularLinkedList<V> rotorC) {
        this.rotorC = rotorC;
    }

    public CircularLinkedList<V> getRotorC() {
        return rotorC;
    }

}
