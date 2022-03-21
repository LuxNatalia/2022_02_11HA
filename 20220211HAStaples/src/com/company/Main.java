package com.company;

public class Main {
    /* Given the String like “20*((876/8)+19)” , implements the method that check if the parentheses are correct. Try to solve it yourself without help of Google
    “9*(8+3)-( (9+1)5)” -> true
    “9(8+3)- (9+1)5)” -> false
    “98+3)-( (9+1)*5” -> false */
    public static void main(String[] args) {
        String str1 = "20*((876/8)+19)";
        String str2 = "9(8+3)- (9+1)5)";
        String str3 = "9*(8+3)-( (9+1)5)";
        String str4 = "98+3)-( (9+1)*5";
        String str5 = ")98+3(-(9+1)*5";
        String str6 = "(98+3)-)9+1)*5";
        isBracketsCorrect(str1);
        isBracketsCorrect(str2);
        isBracketsCorrect(str3);
        isBracketsCorrect(str4);
        isBracketsCorrect(str5);
        isBracketsCorrect(str6);
    }

    public static void isBracketsCorrect(String str) {
        int control = 0;
        int i = 0;
        do {
            if (str.charAt(i) == '(') {
                control = control + 1;
            }
            if (str.charAt(i) == ')') {
                control = control - 1;
            }
            i = i + 1;

        } while (control >= 0 && i < str.length());
        if (control < 0 || control > 0) {
            System.out.println(str + "  false ");
            }else {
                System.out.println(str + "  true ");
        }
    }
}