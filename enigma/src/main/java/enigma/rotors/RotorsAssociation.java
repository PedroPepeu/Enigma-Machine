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

    public void setRotorA(CircularLinkedList rotorA) {
        this.rotorA = rotorA;
    }

    public CircularLinkedList getRotorA() {
        return rotorA;
    }

    public void setRotorB(CircularLinkedList rotorB) {
        this.rotorB = rotorB;
    }

    public CircularLinkedList getRotorB() {
        return rotorB;
    }

    public void setRotorC(CircularLinkedList rotorC) {
        this.rotorC = rotorC;
    }

    public CircularLinkedList getRotorC() {
        return rotorC;
    }

}
