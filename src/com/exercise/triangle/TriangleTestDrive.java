package com.exercise.triangle;

/**
 * Created by tetianabutenko on 23/02/2015.
 */
public class TriangleTestDrive {
    public static void main(String[] args){
        Triangle one = new Triangle();

        one.setAsterisk('*');
        char oneAsterisk = one.getAsterisk();

        System.out.println("Easiest exercise ever");
//        Print one asterisk to the console.
//        Example:
//        *

        System.out.println(oneAsterisk);

        System.out.println("Draw a horizontal line");
//        Given a number n, print n asterisks on one line.
//        Example when n=8:
//        ********

        int n = 8;

        while (n > 0){
            System.out.print(oneAsterisk);
            n = n - 1;
        }

        System.out.println("");
        System.out.println("Draw a vertical line");
//        Given a number n, print n lines, each with one asterisks
//        Example when n=3:
//        *
//        *
//        *

        int line = 3;

        while(line > 0){
            System.out.println(oneAsterisk);
            line = line - 1;
        }

        System.out.println("Draw a right triangle");
//        Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
//        Example when n=3:
//        *
//        **
//        ***

        for (int i = 0; i < 3; i = i + 1) {
            for (int j = 0; j < 3; j = j + 1) {
                if (j <= i) {
                    System.out.print(oneAsterisk);
                }
            }
            System.out.println("");
        }

        System.out.println("Isosceles Triangle");
//        Given a number n, print a centered triangle. Example for n=3:
//          *
//         ***
//        *****

        for (int row = 0; row < 3; row = row + 1) {
                //m < 3 - row - 1 calculating how many spaces we need- we abstract number of row from 3 and abstract 1 because our
                //rows starts with 0.
            for (int m = 0; m < 3 - row - 1; m = m + 1) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * row; k = k + 1) {
                System.out.print("*");
            }

            System.out.println("");
        }

        System.out.println("Diamond");
//        Given a number n, print a centered diamond. Example for n=3:
//
//          *
//         ***
//        *****
//         ***
//          *

        for (int row = 0; row < 2; row = row + 1) {

            for(int m = 0; m < 3 - row - 1 ; m = m + 1) {
                System.out.print(" ");
            }
            for(int k = 0; k <= 2 * row ; k = k + 1) {
                System.out.print(oneAsterisk);
            }

            System.out.println("");
        }

        for (int row = 0; row < 3; row = row + 1) {

            for(int m = 0; m <  row; m = m + 1) {
                System.out.print(" ");
            }
            for(int k = 0; k <= (3 - row - 1)* 2; k = k + 1) {
                System.out.print(oneAsterisk);
            }

            System.out.println("");
        }

        System.out.println("Diamond with Name");
//        Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//          *
//         ***
//        Bill
//         ***
//          *

        for (int row = 0; row < 2; row = row + 1) {

            for(int m = 0; m < 3 - row - 1 ; m = m + 1) {
                System.out.print(" ");
            }
            for(int k = 0; k <= 2 * row ; k = k + 1) {
                System.out.print(oneAsterisk);
            }

            System.out.println("");
        }

        System.out.println("Bill");

        for (int row = 0; row < 2; row = row + 1) {

            for(int m = 0; m <  row + 1; m = m + 1) {
                System.out.print(" ");
            }
            for(int k = 0; k <= (2 - row - 1)* 2; k = k + 1) {
                System.out.print(oneAsterisk);
            }

            System.out.println("");
        }

        System.out.println("--FizzBuzz--");
//        FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to certain rules.
//
//                Create a FizzBuzz() method that prints out the numbers 1 through 100.
//        Instead of numbers divisible by three print "Fizz".
//                Instead of numbers divisible by five print "Buzz".
//                Instead of numbers divisible by three and five print "FizzBuzz".

        int number = 1;
        while (number < 101){
            if(number % 3 == 0 && number % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(number % 3 == 0) {
                System.out.println("Fizz");
            } else if(number % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
            number = number + 1;
        }

        System.out.println("Prime factors exercise");
//        Write a method generate(int n) that given an integer N will return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order.
//
//        For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

        System.out.println(PrimeNum.generate(30));

    }
}
