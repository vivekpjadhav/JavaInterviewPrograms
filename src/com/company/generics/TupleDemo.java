package com.company.generics;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.spi.LocaleServiceProvider;

public class TupleDemo {

    public static void main(String[] args) {
        Tuple<Integer,String> tuple = new Tuple<>(1,"helo");
        System.out.println(tuple);

        Tuple<LocalDate, List<String>> tuple1 = new Tuple<>(LocalDate.now(), Arrays.asList("A","B","C","D"));
    }
}
