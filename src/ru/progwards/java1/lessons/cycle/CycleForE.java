package ru.progwards.java1.lessons.cycle;

public class CycleForE {
    static final int DAYS_IN_YEAR = 365;
    static final int HOURS_IN_YEAR = DAYS_IN_YEAR * 24;
    static final int SECONDS_IN_YEAR = HOURS_IN_YEAR * 3600;

    public static void main(String[] args) {
        double startSum = 1;

        long intervalsInYear = SECONDS_IN_YEAR * 1000L;
        double sumIncreaseInInterval = 1d / intervalsInYear;

        double sumIncrease = 0;
        for (long i = 0; i < intervalsInYear; i++) {
            double currentSum = startSum + sumIncrease;
            sumIncrease += currentSum * sumIncreaseInInterval;
        }

        System.out.println("Периодов " + intervalsInYear);
        System.out.println("В результате получим " + (startSum + sumIncrease));
    }
}
