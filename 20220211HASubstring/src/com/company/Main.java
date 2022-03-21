package com.company;

public class Main {
/* Реализовать метод substring для 2х аргументов */
    public static void main(String[] args) {
	String str="Международная технологическая школа Тел-Ран Берлин";
    int begin=30;
    int end=43;
        System.out.println(str);
        System.out.println(subStr(str, begin, end));
    }

    public static String subStr(String str, int begin, int end) {
        String rezStr="";
        for (int i=begin; i<end; i++) {
            rezStr=rezStr+str.charAt(i);
        }
        return rezStr;
    }
}
