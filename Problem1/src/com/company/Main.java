//Write a function that combines two lists by alternatingly taking elements. For example: given the 
//two lists [a, b, c] and [1, 2, 3], the function should return [a, 1, b, 2, c, 3].

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String [] arr0 = {"a","b","c"};
        String [] arr1 = {"1","2","3"};
        
        System.out.println(Arrays.toString(shuffle(arr0, arr1)));
    }

    private static String[] shuffle(String[]c, String[]n) {
        String[] s = new String[c.length + n.length];
        int i;
        for(i=0;i<c.length;i++){
            s[i]=c[i];
            s[i+1]=n[i];
            i++;
        }
        return s;
    }
}
