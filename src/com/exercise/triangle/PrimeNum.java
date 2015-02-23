package com.exercise.triangle;

/**
 * Created by tetianabutenko on 23/02/2015.
 */
class PrimeNum {

    int generate(int n){
        int z = 2;

        while(z < n){

            if(n % z == 0) {
                System.out.println(z);
            }
            z = z + 1;
        }

        System.out.println(z);
        return z;
    }
}
