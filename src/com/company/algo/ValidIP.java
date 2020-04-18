package com.company.algo;

import java.util.Arrays;

public class ValidIP {

    static boolean validateIP(String ip) {
        // your code goes here
        int value;
        String[] ipString = ip.split("\\.");
        if(ipString.length !=4 ) return false;
        for(String s :ipString){
            try{
                value = Integer.parseInt(s);
                char[] val = s.toCharArray();
                if(s.length() > 1 && s.charAt(0) == '0' )
                    return false;

            }  catch(NumberFormatException e){
                return false;
            }
            if(value> 255) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        char[] one = {'v','i','v','e','j',' ',' '};
        char[] two = {'v','i','v','e','j'};

        StringBuffer stringBuffer = new StringBuffer("");

        System.out.println(Arrays.equals(one, two));
       // System.out.println(validateIP("192.168.123.456"));
        //System.out.println(validateIP("123.24.59.99"));

    }

}
