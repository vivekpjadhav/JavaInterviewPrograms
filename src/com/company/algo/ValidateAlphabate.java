package com.company.algo;

public class ValidateAlphabate {


    static int decodeVariations(String str) {
        // your code goes here
        //1 --> 1
        try {
            int a = Integer.parseInt(str);
        }catch(RuntimeException e){
            return 0;
        }

        char[] z = str.toCharArray();



        char prev = '0';
        if (z.length <= 0) return 0;
        int count = 1;
        for (char c : z) {


            if (Character.getNumericValue(c) > 0 && Character.getNumericValue(c) <= 6
                    && Character.getNumericValue(prev) > 0 && Character.getNumericValue(prev) <= 2) {
                count++;
            }

            prev = c;


        }

        return count;
    }


    public static void main(String[] args) {

        System.out.println(decodeVariations("1262"));

    }


}
