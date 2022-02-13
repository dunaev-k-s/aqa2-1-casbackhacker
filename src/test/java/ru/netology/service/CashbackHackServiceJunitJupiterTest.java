package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CashbackHackServiceJunitJupiterTest {
    @Test
    void shouldTestRegularAmount() {
        int amount = 1800;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);
    }
    @Test
    void shouldTestBoundAmount() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void shouldTestNullAmount() {
        int amount = 0;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }
}