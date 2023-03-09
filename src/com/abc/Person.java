package com.abc;


public class Person {
    protected int id;
    protected String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
//    public Person() {
//        System.out.println("Person constructor called");
//    }


    public void doWork() {
        System.out.println("Person started work");
    }

        public String toString() {
        return this.id + " " + this.name;
    }
}

