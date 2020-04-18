package com.company.algo;

public class PattrenMAcher {

    public static  boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();
        boolean first_match = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            return (isMatch(text, pattern.substring(2)) ||
                    (first_match && isMatch(text.substring(1), pattern)));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }

    public static void main(String[] args) {
        //text = "acd", pattern = "ab*c.
        System.out.println(isMatch("abc","ab*c"));
    }
}


//import java.io.*;
//        import java.util.*;
//
//class Solution {
//
//    //Solution
//  /*
// I/p:   aaaaabbbccc
//
// Pattern: a*b*c* - true
//          a*b - false
//
//
//   * -> previous char and match until it satisfies
//   . -> match any character
//
//*/
//
////  textIndex = 0;
//
//
//
//
//    static boolean isMatch(String text, String pattern) {
//        // your code goes here
//
//        int patIndex = 0;
//        char previousChar = '\0';
//
//        for(char c : text.toCharArray()) {
//
//
//            char patChar ;
//            if(patIndex >= pattern.length()) return false;
//
//
//            patChar = pattern.charAt(patIndex);
//
//            if(patChar == '.') continue;
//            if(patChar == '*' ) {
//                if(previousChar != '\0' && previousChar == c ) continue;
//                else {
//                    patIndex++;
//                }
//            }
//
//
////        if(patIndex+1 < pattern.length() && pattern.charAt(patIndex+1) == '*') {
////          previousChar = c;
////          patIndex++;
////        }
////
//            if(patChar != c ) return false;
//
//            previousChar = c;
//            patIndex++;
//
//        } // end of loop
//
//
//        if(patIndex != pattern.length()) {
//            return false;
//        }
//
//        return true;
//
//    }
//
//    public static void main(String[] args) {
//// text = "acd", pattern = "ab*c.
//    }
//
//}


//Lets rejoin
