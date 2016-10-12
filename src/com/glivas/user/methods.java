package com.glivas.user;


public class methods {
    public static boolean isPositive (double num) {
        boolean isPositive = false;
        if (num > 0) {
            isPositive = true;
        }

        else if (num < 0) {
            isPositive = false;
        }
        return isPositive;
    }

    public static boolean isZero (int num) {
        boolean isZero;
        if (num == 0 ) {
            isZero = true;
        } else {
            isZero = false;
        }
        return isZero;
    }

    public static double delta (double a, double b, double c) {

        return (b * b) - 4 * (a * c);
    }


}

