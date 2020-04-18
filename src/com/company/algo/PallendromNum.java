package com.company.algo;

import com.sun.security.jgss.GSSUtil;

public class PallendromNum {

    static boolean isPalindrome(int x) {
        if(x<0 || (x %10 ==0 && x !=0)) return false;
         int rem = 0;
        while(x> rem){

            rem = rem *10 + x %10 ;
            x=x/10;


        }
        return (x==rem || x ==rem/10);

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1912191));
    }

}
