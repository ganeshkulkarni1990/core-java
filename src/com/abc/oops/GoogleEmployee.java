package com.abc.oops;

public class GoogleEmployee extends Employee{
    private double benifits;

    public GoogleEmployee(int id, String name, double sal, double benifits){
        super(id, name, sal);
        this.benifits = benifits;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.salary + " " + this.benifits;
    }
}
