package ru.progwards.java1.lessons.tryfinally;

public class TryFinally {
    static String ex1() {
        try {
            return "foo";
        } finally {
            return "bar";
        }
    }
    public static void main(String[] args) {
        System.out.println(ex1());
    }
}
