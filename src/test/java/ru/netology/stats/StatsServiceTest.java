package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        int [] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(sale);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverage(sale);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxSaleMonth() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSalesMonth(sale);

        assertEquals(expected, actual);
    }

    @Test
    void findMinSaleMonth() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSalesMonth(sale);

        assertEquals(expected, actual);
}
    @Test
    void monthCounterUnderAve() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findMonthsUnderAverage(sale);

        assertEquals(expected, actual);
    }

    @Test
    void monthCounterOverAve() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findMonthsOverAverage(sale);

        assertEquals(expected, actual);
    }
}