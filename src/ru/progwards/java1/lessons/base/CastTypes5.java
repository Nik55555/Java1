package ru.progwards.java1.lessons.base;

public class CastTypes5 {
    public static void main(String[] args) {
        double doubleValue = 123.5555555555555;

        long longValue = (long)doubleValue;
        int intValue = (int)doubleValue;
        short shortValue = (short)doubleValue;
        byte byteValue = (byte)doubleValue;

        System.out.println("doubleValue  = " + doubleValue);

        System.out.println("\nlongValue  = " + longValue);
        System.out.println("intValue   = " + intValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("byteValue  = " + byteValue);

        System.out.println("\nlongValue  = " + Long.toHexString(longValue));
        System.out.println("intValue   = " + Integer.toHexString(intValue));
        System.out.println("shortValue = " +
                Integer.toHexString(Short.toUnsignedInt(shortValue)));
        System.out.println("byteValue  = " +
                Integer.toHexString(Byte.toUnsignedInt(byteValue)));
    }
}
