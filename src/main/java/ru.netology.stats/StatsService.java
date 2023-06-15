package ru.netology.stats;


public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int sum(long[] sales) {
        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            total = (int) (total + sales[i]);
        }


        return total;
    }

    public int average(long[] sales) {
        return sum(sales) / sales.length;
        }


    public int lowThanAverage(long[] sales) {
        int lowAverage = 0;

        for (long sale : sales) {
            if (sale < average(sales)) {
                lowAverage++;
            }
        }


        return lowAverage;
    }

    public int highThanAverage(long[] sales) {
        int highAverage = 0;

        for (long sale : sales) {
            if (sale > average(sales)) {
                highAverage++;
            }
        }


        return highAverage;
    }


}
