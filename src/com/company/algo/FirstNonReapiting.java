package com.company.algo;

public class FirstNonReapiting {

    public static void main(String[] args) {
        System.out.println(nonRepeating("aapple"));
    }

    static  int nonRepeating(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length ; i++) {

            if(chars[i] != chars[i+1] && i==0){
                return chars[i];
            }else  if(chars[i] != chars[i+1] && chars[i]!=chars[i-1] && i < chars.length-2){
                return chars[i];
            }else if(i == chars.length-1 && chars[i] != chars[i-1]){
                return i;
            }


        }
        return -1;
    }

}
