package com.company.oop;

public class Salaried extends Employee {

    public static final double DEFAULT_SALARY=120000;
    private double salary = DEFAULT_SALARY;

    public Salaried(){
        /**
         *    bellow changes in case we comment out the emloyee constructor
         *             can call this is super dont have the defult constructor
         *             super(Employee.DEFAULT_NAME);
         *             or we can call
         *             this(Employee.DEFAULT_NAME,Salaried.DEFAULT_SALARY);
         */
    }
    public Salaried( String name){
        this(name,DEFAULT_SALARY);
    }
    public Salaried(String name,double salary){
        super(name);
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return salary / 24;
    }
}
