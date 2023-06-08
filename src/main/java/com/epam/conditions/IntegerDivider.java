package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        int quotient = 1;
        int result = 1;
        if (divider == 0) {
            System.out.println("division by zero");
        }
        else{
            quotient = dividend / divider;
            result = quotient * divider;

            if (result == dividend) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }
        }
    }

}
