package com.company.oop;

import java.time.LocalDate;

public  abstract class Employee {

    public static final String DEFAULT_NAME = "UNKNOWN";
    public static int nextId;

    private Integer id;
    private String name;
    private LocalDate hireDate;
    // Default constructor
    public Employee(){
        // to call one constructor to another
        this(DEFAULT_NAME);
    }

    public Employee(String name) {
        id = nextId++;
        this.name = name;
        hireDate=  LocalDate.now();
    }

    public abstract double getPay();

    private void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }

    public Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format("Employee{id=%d,name=%s,hireDate=%s}",id,name,hireDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getId() != null ? !getId().equals(employee.getId()) : employee.getId() != null) return false;
        if (getName() != null ? !getName().equals(employee.getName()) : employee.getName() != null) return false;
        return hireDate != null ? hireDate.equals(employee.hireDate) : employee.hireDate == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (hireDate != null ? hireDate.hashCode() : 0);
        return result;
    }
}
