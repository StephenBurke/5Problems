//
package com.company;

public class Main {

    public static void main(String[] args) {
        //create and fill array
        int[] a = { 1, 2, 3, 4, 5 };
        int sum = sumOfArray(a, a.length-1);

    }

    //recursive sumOfArray
    public int sumOfArray(int[] a, int n) {
        if (n == 0)
            return a[n];
        else
            return a[n] + sumOfArray(a, n-1);
    }

    //while loop sum the array
    public int whileSumArray(int [] a, int n){
        int sum =0;
        while(n<a.length){
            
        }
    }
    
    // // for loop forAdd 
    // public int forAdd(int[] arr2){

    //     int sum = 0;
    //     for (int anArr1 : arr2) {
    //         sum+=anArr1;
    //     }
    //     return sum;
    // }

}
