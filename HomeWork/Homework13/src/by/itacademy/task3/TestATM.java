package by.itacademy.task3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestATM extends Assert {
    ATM atm;

    @Before
    public void before() {
        atm = new ATM();
    }

    @After
    public void after() {
        atm = null;
    }

    @Test
    public void testAddMoney() {

        atm.put(100);
        assertTrue(atm.get100() == 1);
        assertTrue(atm.get50() == 0);
        assertTrue(atm.get20() == 0);

        atm.put(280);
        assertTrue(atm.get100() == 3);
        assertTrue(atm.get50() == 0);
        assertTrue(atm.get20() == 4);

        atm.put(70);
        assertTrue(atm.get100() == 3);
        assertTrue(atm.get50() == 1);
        assertTrue(atm.get20() == 5);

        atm.put(0);
        assertTrue(atm.get100() == 3);
        assertTrue(atm.get50() == 1);
        assertTrue(atm.get20() == 5);
    }

    @Test
    public void testWithdraw() {

        atm.put(10370);

        atm.withdraw(50);
        assertTrue(atm.get50() == 0);

        atm.withdraw(200);
        assertTrue(atm.get100() == 101);
        assertTrue(atm.get20() == 1);

    }
}
