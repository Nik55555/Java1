package ru.progwards.java1.lessons.base;

public class CastTypes5 {
    public static void main(String[] args) {
        double doubleValue = 9999999999999999999999999.55555;

        long longValue = (long)doubleValue;
        int intValue = (int)doubleValue;
        short shortValue = (short)doubleValue;
        byte byteValue = (byte)doubleValue;

        System.out.println("doubleValue  = " + doubleValue);

        System.out.println("\nlongValue  = " + longValue);
        System.out.println("intValue   = " + intValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("byteValue  = " + byteValue);

        System.out.println("\nLong.MAX_VALUE    = " + Long.MAX_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
    }
}
