package ru.netology.gradle.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    @Test
    public void testAmountBelowBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void testAmountAboveBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(expected, actual);
    }
    @Test
    public void testAmountEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0 ;
        assertEquals(expected, actual);
    }
   }
