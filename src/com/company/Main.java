//
package com.company;

public class Main {

    public static void main(String[] args) {
        //create and fill array
        int[] a = { 1, 2, 3, 4, 5 };

        //test methods  
        int sum0 = recursiveSumOfArray(a, a.length-1);
        int sum1 = whileSumOfArray(a);
        int sum2 = forSumOfArray(a);

        System.out.println("The three sums are " + sum0 + " " + sum1 + " " + sum2);

    }

    //recursive recursiveSumOfArray
    private static int recursiveSumOfArray(int[] a, int n) {
        if (n == 0)
            return a[n];
        else
            return a[n] + recursiveSumOfArray(a, n-1);
    }



    //while loop sum the array
    private static int whileSumOfArray(int [] a){
        int sum =0;
        int n =0;
        while(n<a.length){
            sum+=a[n];
            n++;
        }
        return sum;
    }
    
    // for loop forSumOfArray 
    private static int forSumOfArray(int[] arr2){
        int sum = 0;
        for (int anArr1 : arr2) {
            sum+=anArr1;
        }
        return sum;
    }

}
