package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;

        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findMonthsUnderAverage(int[] sales) {
        int monthCounterUnderAve = 0;
        double Average = calculateSum(sales) / sales.length;

        for (int sale : sales) {
            if (sale < Average) {
                monthCounterUnderAve++;
            }
        }
        return monthCounterUnderAve;
    }

    public int findMonthsOverAverage(int[] sales) {
        int monthCounterOverAve = 0;
        double Average = calculateSum(sales) / sales.length;

        for (int sale : sales) {
            if (sale > Average) {
                monthCounterOverAve++;
            }
        }
        return monthCounterOverAve;
    }
}
