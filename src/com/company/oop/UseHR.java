package com.company.oop;

public class UseHR {
    public static void main(String[] args) {
        HR hr = new HR();
        hr.hire(new Hourly("Barney"));
        hr.hire(new Salaried("Fred"));
        hr.hire(new Salaried());
        hr.hire(new Hourly());
        hr.printEveryBody();
        hr.payEveryBody();
    }
}
