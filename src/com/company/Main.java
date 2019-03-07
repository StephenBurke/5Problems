package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[10];
        int i = 0;
        while(i<arr1.length){
            arr1[i]= 2;
            i++;
        }


        System.out.println(forAdd(arr1));
    }
    public static int forAdd(int[] arr2){

        int sum = 0;
        for (int anArr1 : arr2) {
            sum+=anArr1;
        }
        return sum;
    }
}
