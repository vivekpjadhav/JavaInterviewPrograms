package com.company.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class Vivek{
        String name;
        Integer age;

    public Vivek(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
public class ProcessDictionary {



    public static void main(String[] args) throws Exception {


        ExecutorService executorService = Executors.newCachedThreadPool();
        CompletableFuture.supplyAsync(()->getFileLines(),executorService);


    /*    Optional<String> max = Files.lines(
                Paths.get("/", "usr", "share", "dict", "web2"))
                .filter(s -> s.length() > 10)
                .map(String::toLowerCase)
                .sorted(Comparator.comparing(String::length).reversed())
                .findFirst();

        System.out.println(max.isPresent() ? max.get() : max.orElse("None found"));
        System.out.println(max.orElseGet(() -> "nothing"));
        System.out.println(max.orElse("nothing"));*/
    }

    static boolean getFileLines ()  {
        try {
            Files.lines(
                    Paths.get("/", "usr", "share", "dict", "web2"))
                    .filter(s -> s.length() > 10)
                    .map(String::toLowerCase)
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .limit(10)
                    .forEach((String w) ->
                            System.out.printf("%s (%d)%n", w, w.length()));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
