package ru.progwards.java1.lessons.base;

public class CastTypes2 {
    public static void main(String[] args) {
        long longValue = 25;

        int intValue = (int)longValue;
        short shortValue = (short)intValue;
        byte byteValue = (byte)shortValue;

        System.out.println("longValue = " + longValue);
        System.out.println("intValue = " + intValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("byteValue = " + byteValue);
    }
}
