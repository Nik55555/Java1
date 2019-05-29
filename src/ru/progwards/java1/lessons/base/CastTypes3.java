package ru.progwards.java1.lessons.base;

public class CastTypes3 {
    public static void main(String[] args) {
        long longValue = 333_555_777_999L;

        int intValue = (int)longValue;
        short shortValue = (short)intValue;
        byte byteValue = (byte)shortValue;

        System.out.println("longValue  = " + Long.toHexString(longValue));
        System.out.println("intValue   =   " + Integer.toHexString(intValue));
        System.out.println("shortValue =       " + Integer.toHexString(Short.toUnsignedInt(shortValue)));
        System.out.println("byteValue  =         " + Integer.toHexString(Byte.toUnsignedInt(byteValue)));
    }
}
