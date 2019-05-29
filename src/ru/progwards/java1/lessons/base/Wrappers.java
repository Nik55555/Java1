package ru.progwards.java1.lessons.base;

public class Wrappers {
    public static void main(String[] args) {
        Byte wrapperB1 = 5; // автоупаковка
        Short wrapperS1 = 555; // автоупаковка
        Integer wrapperI1 = 55555; // автоупаковка
        Long wrapperL1 = 5_555_555_555L; // автоупаковка
        Double wrapperD1 = 555555.555555; // автоупаковка

        byte b1 = wrapperB1.byteValue(); // явная распаковка
        short s1 = wrapperS1.shortValue(); // явная распаковка
        int i1 = wrapperI1.intValue(); // явная распаковка
        long l1 = wrapperL1.longValue(); // явная распаковка
        double d1 = wrapperD1.doubleValue(); // явная распаковка

        byte b2 = wrapperB1; // автораспаковка
        short s2 = wrapperS1; // автораспаковка
        int i2 = wrapperI1; // автораспаковка
        long l2 = wrapperL1; // автораспаковка
        double d2 = wrapperD1; // автораспаковка
    }
}
