package ru.progwards.java1.lessons.base;

import java.util.Date;

public class StringConcatTest {
    public static String m1() {
        //медленно
        String[] fields = new String[] {"a","b","c","d","e","f","g"};
        String s = "";
        for (int i = 0; i < fields.length; i++) {
            s += fields[i];
        }
        return s;
    }

    public static String m2() {
        //быстро
        String[] fields = new String[] {"a","b","c","d","e","f","g"};
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            s.append(fields[i]);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        long start = new Date().getTime();
        for (int i = 0; i < 10000000; i++) {
            m1();
        }
        System.out.println(new Date().getTime() - start);

        start = new Date().getTime();
        for (int i = 0; i < 10000000; i++) {
            m1();
        }
        System.out.println(new Date().getTime() - start);

    }
}
