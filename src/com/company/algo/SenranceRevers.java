package com.company.algo;

import java.io.*;
import java.util.*;

class SenranceRevers {

    static char[] reverseWords(char[] arr) {
        // your code goes here
        int n = arr.length -1;
        revers(arr,0,n);
        int x =0;
        for(int i =0 ; i<= n ; i++){

            if(arr[i] == ' '){
                revers(arr,x,i-1);
                x=i+1;
            }

        }
        return arr;

    }

    static void revers (char[] arr ,int i , int j){
        for(int x =0 ,y=j; x <=y  ; x++,y--){
            char temp = arr[x];
            arr[i] = arr[y];
            arr[j] = temp;
        }

//        // c b a
//        for(int k =0 ,l=j; k <=l  ; k++,l--){
//            char temp = arr[k];
//            arr[k] = arr[l];
//            arr[l] = temp;
//        }


    }



    public static void main(String[] args) {
     char [] arr = new char[]{'a',' ','b','a',' ','c','b','a'};
        System.out.println(reverseWords(arr));
    }


  /*
    [' ']
    ['w''e''l'f'' '' 'e''e''b'' 'a']
    ['w','e',l',f, b','e','e',' ','f',' ','','a']
    ['w',' ','b','e','e',' ','f','l','','a']
   []
    []
  */
}
