package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int rev = 0;
        while (number != 0) {
            int remainder = number % 10;
            rev = rev * 10 + remainder;
            number = number / 10;
        }
        System.out.println(rev);
    }
}
