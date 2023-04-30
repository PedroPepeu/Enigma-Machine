package enigma.rotors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import enigma.rotors.Rotor;

public class TestRotor {

    @Test
    public void test01PositionNoChanges() 
    {
        Rotor r = new Rotor();
        Assertions.assertTrue(r.position() == 'A');
    }

    @Test
    public void test02PositionChanges26() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 26; i++) r.roll()
        Assertions.assertTrue(r.position() == 'Z');
    }

    @Test
    public void test03PositionChanges25() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 25; i++) r.roll()
        Assertions.assertTrue(r.position() == 'Y');
    }

    @Test
    public void test04PositionChanges24() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 24; i++) r.roll()
        Assertions.assertTrue(r.position() == 'X');
    }

    @Test
    public void test05PositionChanges23() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 23; i++) r.roll()
        Assertions.assertTrue(r.position() == 'W');
    }

    @Test
    public void test06PositionChanges22() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 22; i++) r.roll()
        Assertions.assertTrue(r.position() == 'V');
    }

    @Test
    public void test07PositionChanges21() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 21; i++) r.roll()
        Assertions.assertTrue(r.position() == 'U');
    }

    @Test
    public void test08PositionChanges20() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 20; i++) r.roll()
        Assertions.assertTrue(r.position() == 'T');
    }

    @Test
    public void test09PositionChanges19() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 19; i++) r.roll()
        Assertions.assertTrue(r.position() == 'S');
    }

    @Test
    public void test10PositionChanges18() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 18; i++) r.roll()
        Assertions.assertTrue(r.position() == 'R');
    }

    @Test
    public void test11PositionChanges17() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 17; i++) r.roll()
        Assertions.assertTrue(r.position() == 'Q');
    }

    @Test
    public void test12PositionChanges16() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 16; i++) r.roll()
        Assertions.assertTrue(r.position() == 'P');
    }

    @Test
    public void test13PositionChanges15() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 15; i++) r.roll()
        Assertions.assertTrue(r.position() == 'O');
    }

    @Test
    public void test14PositionChanges14() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 14; i++) r.roll()
        Assertions.assertTrue(r.position() == 'N');
    }

    @Test
    public void test15PositionChanges13() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 13; i++) r.roll()
        Assertions.assertTrue(r.position() == 'M');
    }

    @Test
    public void test16PositionChanges12() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 12; i++) r.roll()
        Assertions.assertTrue(r.position() == 'L');
    }

    @Test
    public void test17PositionChanges11() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 11; i++) r.roll()
        Assertions.assertTrue(r.position() == 'K');
    }

    @Test
    public void test18PositionChanges10() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 10; i++) r.roll()
        Assertions.assertTrue(r.position() == 'J');
    }

    @Test
    public void test19PositionChanges9() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 9; i++) r.roll()
        Assertions.assertTrue(r.position() == 'I');
    }

    @Test
    public void test20PositionChanges8() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 8; i++) r.roll()
        Assertions.assertTrue(r.position() == 'H');
    }

    @Test
    public void test21PositionChanges7() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 7; i++) r.roll()
        Assertions.assertTrue(r.position() == 'G');
    }

    @Test
    public void test22PositionChanges6() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 6; i++) r.roll()
        Assertions.assertTrue(r.position() == 'F');
    }

    @Test
    public void test23PositionChanges5() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 5; i++) r.roll()
        Assertions.assertTrue(r.position() == 'E');
    }

    @Test
    public void test24PositionChanges4() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 4; i++) r.roll()
        Assertions.assertTrue(r.position() == 'D');
    }

    @Test
    public void test25PositionChanges3() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 3; i++) r.roll()
        Assertions.assertTrue(r.position() == 'C');
    }

    @Test
    public void test26PositionChanges2() 
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 2; i++) r.roll()
        Assertions.assertTrue(r.position() == 'B');
    }

    @Test
    public void test27PositionChange26Plus3()
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 29; i++) r.roll()
        Assertions.assertTrue(r.position() == 'C');
    }

    @Test
    public void test28PositionChange15ThenReset()
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 15; i++) r.roll()
        r.reset();
        Assertions.assertTrue(r.position() == 'A');
    }

    @Test
    public void test29PositionChange26Plus3()
    {
        Rotor r = new Rotor();
        for(int i = 1; i <= 26; i++) r.roll()
        Assertions.assertTrue(r.lastLetter());
    }
    
}
