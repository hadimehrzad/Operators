package com.HMehrzad.Learning;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);
        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);
        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);
        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);
        // result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);
        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);
        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);
        // if-then Statement
        boolean isAlien = false;
        //if (isAlien == false)
        if (isAlien == true) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }
        // Logical "And" and "Or" Operator
        //int topScore = 100;
        int topScore = 80;
        //if (topScore >= 100)
        //if (topScore > 100)
        //if (topScore != 100)
        //if (topScore == 100)
        if (topScore < 100) {
            System.out.println("You got the hight score!");
        }
        int secondScore = 60;
        if ((topScore > secondScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90) || (secondScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
        // Assignment Operators VS Equals to Operator
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }
        /*
        if (isCar)
        if (isCar == false)
        if (isCar == true)
        if (!isCar)
         */
        boolean isCar = true;
        if (isCar = true) {
            System.out.println("This is not supposed to happen");
        }
        // Ternry Operator
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar ir true");
        }
        // Operator Precdence and Operator Challenge
        double myFristValue = 20.00;
        double mySecondValue = 80.00d;
        double myValueToyal = (myFristValue + mySecondValue) * 100.00d;
        System.out.println("MyValueTotal = " + myValueToyal);
        double theRemainder = myValueToyal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoremainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}