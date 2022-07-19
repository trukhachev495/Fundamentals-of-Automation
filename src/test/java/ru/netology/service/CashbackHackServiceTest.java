package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(3500);
        int expected = 500;
        assertEquals(result, expected);
    }

    @Test
    public void lessThan1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int result = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(result, expected);
    }
    @Test
    public void lessThan900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertThrows(RuntimeException.class, () -> {cashbackHackService.remain(900);});

    }
}