package com.company;

public class Main {

    public static void main(String[] args) {
        String[] str = {"Olga", "Oleg", "Maria", "Alexandra", "Oleg"};
        String[] str1 = {"Sofia", "Elisa", "Elisa", "Lubov", "Zina", "Nadya"};
        String[] str2 = {"Sofia", "Sofia", "Elisa", "Lubov", "Zina", "Nadya", "Oleg", "Maria", "Alexandra", "Oleg"};
        String[] str3 = {"Maria", "Alexandra", "Oleg", "Oleg"};
        printArray(str);
        System.out.println("  " + isEqualsNames(str));
        printArray(str1);
        System.out.println("  " + isEqualsNames(str1));
        printArray(str2);
        System.out.println("  " + isEqualsNames(str2));
        printArray(str3);
        System.out.println("  " + isEqualsNames(str3));
    }

    public static boolean isEqualsNames(String[] str) {
        for (int i = 1; i < str.length; i++) {
            if (str[i].equals(str[i - 1])) {
                return true;
            }

        }
        return false;
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
