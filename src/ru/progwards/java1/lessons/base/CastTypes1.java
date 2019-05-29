package ru.progwards.java1.lessons.base;

public class CastTypes1 {
    public static void main(String[] args) {
        byte byteValue = 127;

        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;

        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println("byteValue = " + byteValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);

        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);
    }
}
