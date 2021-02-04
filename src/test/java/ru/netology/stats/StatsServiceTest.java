package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateTotal() {
        int total = 0;
        for (int monthlySale : salesByMonth) {
            total += monthlySale;
        }
        assertEquals(180, total);

    }

    @Test
    void calculateMonthMaxSales() {
        int salesMax = 0;
        int month = 0;
        int monthMaxSales = 0;
        for (int monthlySale : salesByMonth) {
            month++;
            if (salesMax <= monthlySale) {
                salesMax = monthlySale;
                monthMaxSales = month;
            }
        }
        assertEquals(8, monthMaxSales);
    }

    @Test
    void calculateMonthMinSales() {
        int salesMin = 100;
        int month = 0;
        int monthMinSales = 0;
        for (int monthlySale : salesByMonth) {
            month++;
            if (salesMin >= monthlySale) {
                salesMin = monthlySale;
                monthMinSales = month;
            }
        }
        assertEquals(9, monthMinSales);
    }

    @Test
    void calculateBelowAverageSales() {
        int average = StatsService.calculateTotal(salesByMonth) / salesByMonth.length;
        int month = 0;
        for (int monthlySale : salesByMonth) {
            if (average > monthlySale) {
                month++;
            }
        }
        assertEquals(5, month);
    }

    @Test
    void calculateAboveAverageSales() {
        int average = StatsService.calculateTotal(salesByMonth) / salesByMonth.length;
        int month = 0;
        for (int monthlySale : salesByMonth) {
            if (average < monthlySale) {
                month++;
            }
        }
        assertEquals(5, month);
    }
}