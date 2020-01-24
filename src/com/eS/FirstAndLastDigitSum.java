package com.eS;

import java.awt.*;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        int lastDigit;
        int firstDigit = number;
        int sum;

        if (number < 0){
            return - 1;
        }

        lastDigit = number % 10;

        while (firstDigit >= 10){
            firstDigit = firstDigit / 10;
        }

        sum = firstDigit + lastDigit;

        return sum;
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(103));
        System.out.println(sumFirstAndLastDigit(-10));
    }
}
