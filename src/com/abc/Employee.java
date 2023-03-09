package com.abc;

public class Employee extends Person {
    protected double salary;

    public Employee(int id, String name, double salary) {
        super(id, name);//intialize the data which is available from parent
        System.out.println("Employee constructor called");
        this.salary = salary; // this self data
    }

    public void doWork(){
        System.out.println("Employee started coding");
        super.doWork();
    }
}