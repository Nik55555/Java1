package ru.progwards.java1.lessons.base;

public class CastTypes4 {
    public static void main(String[] args) {
        double doubleValue = 333777555.999123005;
        float floatValue = (float)doubleValue;

        System.out.println("doubleValue = " + doubleValue);
        System.out.println("floatValue = " + floatValue);

        System.out.println("\nЗначение floatValue бесконечность? " + Float.isInfinite(floatValue));
        System.out.println("floatValue + 555 = " + (floatValue + 555));
        System.out.println("doubleValue / floatValue = " + doubleValue / floatValue);
    }
}
