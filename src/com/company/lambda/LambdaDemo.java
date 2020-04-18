package com.company.lambda;


import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class LambdaDemo {


    public static void main(String[] args) {
        Stream.of(3,1,4,1,5,9).forEach(n-> System.out.println(n));
        Stream.of(3,1,4,1,5,9).sorted(
          ( t1, t2)-> {
                return t1.compareTo(t2);

        }).forEach(System.out::print);



    }
}
