package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        long salesMaximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= salesMaximum) {
                monthMaximum = i;
                salesMaximum = sales[i];
            }
        }
        return monthMaximum + 1;

    }

    public int monthMinimumSale(long[] sales) {
        int monthMaximum = 0;
        long salesMaximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= salesMaximum) {
                monthMaximum = i;
                salesMaximum = sales[i];
            }
        }
        return monthMaximum + 1;
    }

    public int calcMonthSaleBellowAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int calcMonthSaleAboveAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}

