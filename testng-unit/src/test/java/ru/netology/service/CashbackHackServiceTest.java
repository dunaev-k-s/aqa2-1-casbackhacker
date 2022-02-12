package ru.netology.service;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTestRegularAmount() {
        int amount = 1800;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldTestBoundAmount() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldTestNullAmount() {
        int amount = 0;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }
}