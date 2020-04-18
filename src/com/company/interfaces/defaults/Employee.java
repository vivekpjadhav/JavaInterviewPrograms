package com.company.interfaces.defaults;

public interface Employee {
    String getFirst();
    String getLast();
    void doWork();
    static String staticName(){return "vivek"; };
    default String getName() {
        return String.format("%s %s", getFirst(), getLast());
    }
}
