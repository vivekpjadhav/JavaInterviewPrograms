package com.company.oop;

public class Hourly extends Employee {
    public static final double DEFUALT_RATE =100;
    public static final int DEFUALT_HR =80;
    private double rate = DEFUALT_RATE;
    private double hours = DEFUALT_HR;


    public Hourly(){
        this(DEFAULT_NAME,DEFUALT_RATE);
    }
    public Hourly(String name) {
        this(name,DEFUALT_RATE);
    }

    public Hourly(String name , double rate){
        super(name);
        this.rate = rate;

    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getPay() {
        return rate*hours;
    }
}
