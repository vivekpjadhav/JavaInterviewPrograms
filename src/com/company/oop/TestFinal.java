package com.company.oop;

import org.w3c.dom.ls.LSOutput;

import java.io.InputStream;
import java.util.Scanner;

public class TestFinal {

    final void test(int... a){
        for (int i:a){
            System.out.println(i);
        }
    }

    final void test(int a){

            System.out.println(a);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(InputStream.nullInputStream());
        System.out.println(System.in);
    }
}
