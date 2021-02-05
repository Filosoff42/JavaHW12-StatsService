package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateTotal() {
        int total = service.calculateTotal(salesByMonth);
        assertEquals(180, total);

    }

    @Test
    void shouldCalculateAverage() {
        int average = service.calculateAverage(salesByMonth);
        assertEquals(15, average);
    }

    @Test
    void shouldCalculateMonthMaxSales() {
        int monthMaxSales = service.calculateMonthMaxSales(salesByMonth);
        assertEquals(8, monthMaxSales);
    }

    @Test
    void shouldCalculateMonthMinSales() {
        int monthMinSales = service.calculateMonthMinSales(salesByMonth);
        assertEquals(9, monthMinSales);
    }

    @Test
    void shouldCalculateBelowAverageSales() {
        int belowAverageSales = service.calculateBelowAverageSales(salesByMonth);
        assertEquals(5, belowAverageSales);
    }

    @Test
    void shouldCalculateAboveAverageSales() {
        int aboveAverageSales = service.calculateAboveAverageSales(salesByMonth);
        assertEquals(5, aboveAverageSales);
    }
}