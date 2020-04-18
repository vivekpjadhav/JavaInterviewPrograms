package com.company.algo;

import static java.lang.Double.max;

public class RootOfNumber {

    static double rootofNumer(int x , int  n){
        if(x==0) return 0;

        double lowerBound =0 ;
        double upperBount = max(1,x);

        double approxRoot = (upperBount+lowerBound)/2;
        while(approxRoot - lowerBound >=0.01){
            if(Math.pow(approxRoot,n) > x){
                upperBount = approxRoot;
            }else if(Math.pow(approxRoot,n)< x){
                lowerBound =approxRoot;
            }else break;

            approxRoot = (upperBount+lowerBound)/2;
        }


        return Math.round(approxRoot);
    }

    public static void main(String[] args) {
        //System.out.println(Math.pow(3,2));
        System.out.println(rootofNumer(9,2));
    }

}
