package com.company.concurancy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {



    public static void main(String[] args) {
        Main main = new Main();

        Runnable runnable = () ->
        {
            System.out.println(" vivek ");
        };


        new Thread(runnable).start();

    }


}
