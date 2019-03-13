//Write a function that combines two lists by alternatingly taking elements. For example: given the 
//two lists [a, b, c] and [1, 2, 3], the function should return [a, 1, b, 2, c, 3].

package com.company;

public class Main {

    public static void main(String[] args) {
        char [] arr0 = {"a","b", "c"}
        int [] arr1 = {1,2,3}
        
        System.out.println(s);
    }

    private static int[] shuffle(char[]c, int[]n) {
        String[] s = new String[c.length + n.length];
        int a=0;
        int b=0;
        int i=0;
        for(i in c.length){
            s[i]=c[i];
            s[i+1]=n[i];
            i++;
        }
        return s;
    }
}
