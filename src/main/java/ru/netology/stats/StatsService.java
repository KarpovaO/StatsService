package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int averageSum = sum / sales.length;
        return averageSum;
    }

    public int maxSales(int[] sales) {
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

    public int minSales(int[] sales) {
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

    public int calculateMinSalesMonths(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int averageSum = sum / sales.length;
        int count = 0;
        for (int minMonths : sales) {
            if (minMonths < averageSum)
                count++;
        }
        return count;
    }

    public int calculateMaxSalesMonths(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int averageSum = sum / sales.length;
        int count = 0;
        for (int minMonths : sales) {
            if (minMonths > averageSum)
                count++;
        }
        return count;
    }
}




















