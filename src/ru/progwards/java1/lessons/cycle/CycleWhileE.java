package ru.progwards.java1.lessons.cycle;

public class CycleWhileE {
    static final int DAYS_IN_YEAR = 365;
    static final int HOURS_IN_YEAR = DAYS_IN_YEAR * 24;
    static final int SECONDS_IN_YEAR = HOURS_IN_YEAR * 60;

    public static void main(String[] args) {
        double startSum = 1;

        int intervalsInYear = DAYS_IN_YEAR;
        double sumIncreaseInInterval = 1d / intervalsInYear;

        double sumIncrease = 0;
        double accuracy = 0.00001;

        long intervals = 0;
        while (Math.E - (startSum + sumIncrease) > accuracy) {
            double currentSum = startSum + sumIncrease;
            sumIncrease += currentSum * sumIncreaseInInterval;
            intervals++;
        }

        System.out.println(startSum + sumIncrease);
        System.out.println(intervals);
    }
}
