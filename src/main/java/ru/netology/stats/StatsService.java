package ru.netology.stats;

public class StatsService {
    public int sumSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int midSumSalesPerMonth(long[] sales) {
        int midSum = sumSales(sales) / 12;
        return midSum;
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

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int lowerSalesMonths(long[] sales){
        int months = 0;
        int midSales = midSumSalesPerMonth(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < midSales) {
                months++;
            }
        }

        return months;
    }


    public int higherSalesMonths(long[] sales){
        int months = 0;
        int midSales = midSumSalesPerMonth(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > midSales) {
                months++;
            }
        }

        return months;
    }
}
