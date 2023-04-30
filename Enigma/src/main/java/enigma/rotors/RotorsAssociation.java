package enigma.rotors;

public class RotorsAssociation {
    
    Rotor rotorA = new Rotor();
    Rotor rotorB = new Rotor();
    Rotor rotorC = new Rotor();

    public RotorsAssociation(Rotor rotorA, Rotor rotorB, Rotor rotorC) {
        this.rotorA = rotorA;
        this.rotorB = rotorB;
        this.rotorC = rotorC;
    }

    public void resetRolls() {
        rotorA.setCurrentLetter(getRotorA().getHead());
        rotorB.setCurrentLetter(getRotorB().getHead());
        rotorC.setCurrentLetter(getRotorC().getHead());
    }

    public char letterRollB() {
        return letterRollB.getLetter();
    }

    public char letterRollB() {
        return letterRollB.getLetter();
    }

    public char letterRollC() {
        return letterRollC.getLetter();
    }

    @Override
    public void roll() {
        if(rotorA.lastLetter()) {
            if(rotorB.lastLetter()) rotorC.roll();
            rotorB.roll();
        } 
        rotorA.roll();
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
