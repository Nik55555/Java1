package ru.progwards.java1.lessons.helloworld;

public class Main {

    static void println(String message) {
        System.out.println(message);
    }

    static int addition(int x, int y) {
        return x + y;
    }

    static int addition1(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        String hello = "Hello World!";
        println(hello);

        int result = addition(7, 18);
        System.out.print("Сумма равна: ");
        System.out.println(result);
    }
}
