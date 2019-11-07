package ru.progwards.java1.lessons.switchcase;

public class SwitchCase1 {
    enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        int value = 3;

        switch (value) {
            case 1:
                System.out.println("Выбран case 1");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Выбран case 2 или 3 или 4");
                break;
            case 5:
                System.out.println("Выбран case 5");
                break;
            default:
                System.out.println("Выбран default");
                break;
        }
    }
}
