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
}