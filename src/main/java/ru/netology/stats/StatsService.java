package ru.netology.stats;

public class StatsService {
    public static int calculateTotal(int[] salesByMonth) {
        int total = 0;
        for (int monthlySale : salesByMonth) {
            total += monthlySale;
        }
        return total;
    }

    public static int calculateAverage(int[] salesByMonth) {
        int average = calculateTotal(salesByMonth) / salesByMonth.length;
        return average;
    }

    public static int calculateMonthMaxSales(int[] salesByMonth) {
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
        return monthMaxSales;
    }

    public static int calculateMonthMinSales(int[] salesByMonth) {
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
        return monthMinSales;
    }

    public static int calculateBelowAverageSales(int[] salesByMonth) {
        int average = calculateTotal(salesByMonth) / salesByMonth.length;
        int month = 0;
        for (int monthlySale : salesByMonth) {
            if (average > monthlySale) {
                month++;
            }
        }
        return month;
    }

    public static int calculateAboveAverageSales(int[] salesByMonth) {
        int average = calculateTotal(salesByMonth) / salesByMonth.length;
        int month = 0;
        for (int monthlySale : salesByMonth) {
            if (average < monthlySale) {
                month++;
            }
        }
        return month;
    }
}


