package enigma.rotors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import enigma.rotors.*;

public class TestRotorAssociation {

    @Test
    public void test01AllPositionAndAllRotorsPositions()
    {
        RotorsAssociation rA = new RotorsAssociation();
        Assertions.assertTrue(rA.rotorA.position() == rA.letterRollA() &&
                              rA.rotorB.position() == rA.letterRollB() &&
                              rA.rotorC.position() == rA.letterRollC());
    }

    @Test
    public void test02AllPositionNoChanges()
    {
        RotorsAssociation rA = new RotorsAssociation();
        Assertions.assertTrue(rA.rotorA.position() == 'A' &&
                              rA.rotorB.position() == 'A' &&
                              rA.rotorC.position() == 'A');
    }

    @Test
    public void test03AllPositionChanges1()
    {
        RotorsAssociation rA = new RotorsAssociation();
        rA.rollAll();
        Assertions.assertTrue(rA.rotorA.position() == 'B' &&
                              rA.rotorB.position() == 'A' &&
                              rA.rotorC.position() == 'A');
    }

    @Test
    public void test04AllPositionChanges27()
    {
        RotorsAssociation rA = new RotorsAssociation();
        for(int i = 1; i <= 27; i++) rA.rollAll();
        Assertions.assertTrue(rA.rotorA.position() == 'A' &&
                              rA.rotorB.position() == 'B' &&
                              rA.rotorC.position() == 'A');
    }

    @Test
    public void test05AllPositionChanges729()
    {
        RotorsAssociation rA = new RotorsAssociation();
        for(int i = 1; i <= 729; i++) rA.rollAll();
        Assertions.assertTrue(rA.rotorA.position() == 'A' &&
                              rA.rotorB.position() == 'A' &&
                              rA.rotorC.position() == 'B');
    }

    @Test
    public void test06AllPositionChanges27ThenReset()
    {
        RotorsAssociation rA = new RotorsAssociation();
        for(int i = 1; i <= 27; i++) rA.rollAll();
        rA.resetAll();
        Assertions.assertTrue(rA.rotorA.position() == 'A' &&
                              rA.rotorB.position() == 'A' &&
                              rA.rotorC.position() == 'A');
    }
    
}
