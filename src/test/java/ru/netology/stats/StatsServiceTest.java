package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void sumSalesTest() {
        StatsService prog = new StatsService();
        long arr[] = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 180;
        Assertions.assertEquals(expected, prog.sumSales(arr));
    }

    @Test
    void midSumSalesPerMonthTest() {
        StatsService prog = new StatsService();
        long arr[] = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 15;
        Assertions.assertEquals(expected, prog.midSumSalesPerMonth(arr));
    }
    @Test
    void maxSalesTest() {
        StatsService prog = new StatsService();
        long arr[] = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 8;
        Assertions.assertEquals(expected, prog.maxSales(arr));
    }

    @Test
    void minSalesTest() {
        StatsService prog = new StatsService();
        long arr[] = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 9;
        Assertions.assertEquals(expected, prog.minSales(arr));
    }

    @Test
    void lowerSalesMonthsTest() {
        StatsService prog = new StatsService();
        long arr[] = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 5;
        Assertions.assertEquals(expected, prog.lowerSalesMonths(arr));
    }

    @Test
    void higherSalesMonthsTest() {
        StatsService prog = new StatsService();
        long arr[] = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 5;
        Assertions.assertEquals(expected, prog.higherSalesMonths(arr));
    }
}