package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @CsvFileSource(files = "src/test/resources/bonus.csv")
    @ParameterizedTest
    void sumSalesTest(long arr[]) {
        StatsService prog = new StatsService();
        int expected = 180;
        Assertions.assertEquals(expected, prog.sumSales(arr));
    }

    @ParameterizedTest
    void midSumSalesPerMonthTest(long arr[]) {
        StatsService prog = new StatsService();
        int expected = 15;
        Assertions.assertEquals(expected, prog.midSumSalesPerMonth(arr));
    }
    @ParameterizedTest
    void maxSalesTest(long arr[]) {
        StatsService prog = new StatsService();
        int expected = 8;
        Assertions.assertEquals(expected, prog.maxSales(arr));
    }

    @ParameterizedTest
    void minSalesTest(long arr[]) {
        StatsService prog = new StatsService();
        int expected = 9;
        Assertions.assertEquals(expected, prog.minSales(arr));
    }

    @ParameterizedTest
    void lowerSalesMonthsTest(long arr[]) {
        StatsService prog = new StatsService();
        int expected = 5;
        Assertions.assertEquals(expected, prog.lowerSalesMonths(arr));
    }

    @ParameterizedTest
    void higherSalesMonthsTest(long arr[]) {
        StatsService prog = new StatsService();
        int expected = 5;
        Assertions.assertEquals(expected, prog.higherSalesMonths(arr));
    }
}