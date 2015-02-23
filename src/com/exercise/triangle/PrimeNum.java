package com.exercise.triangle;
import java.util.*;

/**
 * Created by tetianabutenko on 23/02/2015.
 */
class PrimeNum {

    //decided to try static method
    public static ArrayList generate(int n){
        ArrayList prime = new ArrayList();

        for (int z = 2; z <= n; z = z + 1) {

            if (n % z == 0) {

                prime.add(z); // add prime factor to arraylist
                n = n/z;
                z = z - 1;
            }
        }

        return prime;
    }
}
