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
        System.out.println(oneAsterisk);

        System.out.println("Draw a horizontal line");
        int n = 8;

        while (n > 0){
            System.out.print(oneAsterisk);
            n = n - 1;
        }

        System.out.println("");
        System.out.println("Draw a vertical line");
        int line = 3;

        while(line > 0){
            System.out.println(oneAsterisk);
            line = line - 1;
        }

        System.out.println("Draw a right triangle");

        for (int i = 0; i < 3; i = i + 1) {
            for (int j = 0; j < 3; j = j + 1) {
                if (j <= i) {
                    System.out.print(oneAsterisk);
                }
            }
            System.out.println("");
        }

        System.out.println("Isosceles Triangle");

        for (int row = 0; row < 3; row = row + 1) {
            //m < 3 - row - 1 calculating how many spaces we need- we abstract number of row from 3 and abstract 1 because our
            //rows starts with 0.
            for(int m = 0; m < 3 - row - 1 ; m = m + 1) {
                System.out.print(" ");
            }
            for(int k = 0; k <= 2 * row ; k = k + 1) {
                System.out.print(oneAsterisk);
            }

            System.out.println("");
        }

//        System.out.println("Diamond");


    }
}
