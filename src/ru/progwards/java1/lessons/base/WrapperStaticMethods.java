package ru.progwards.java1.lessons.base;

public class WrapperStaticMethods {
    public static void main(String[] args) {
        String strPfy2 = "11111100011";
        String strPfy5 = "31034";
        String strPfy8 = "03743"; // 0 перед числом является признаком 8-ой системы
        String strPfy10 = "2019";
        String strPfy16 = "0x7e3"; // 0x перед числом является признаком 16-ой системы

        System.out.println(Integer.parseInt(strPfy2, 2));
        System.out.println(Integer.valueOf(strPfy5, 5));
        System.out.println(Integer.decode(strPfy8));
        System.out.println(Integer.parseInt(strPfy10));
        System.out.println(Integer.decode(strPfy16));
    }
}
