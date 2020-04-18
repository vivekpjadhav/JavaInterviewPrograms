package com.company.lambdasstreams;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Summarizing {
    public static void main(String[] args) {
       int x =2;
       Stream.of(1,2,3,5)
               .mapToInt(
                       n-> {

                         return   n * 2;

                       })
               .forEach(System.out::println);


//        DoubleSummaryStatistics stats = Stream.generate(Math::random)
//                .limit(1000)
//                .collect(Collectors.summarizingDouble(Double::doubleValue));
//        System.out.println(stats);
    }
}
