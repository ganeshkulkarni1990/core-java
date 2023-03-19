package com.abc;

import java.io.*;
import java.util.*;

class Test implements Cloneable {

    // attributes of Student class
    String name = null;
    int id = 0;

    // default constructor
    Test() {
    }

    // parameterized constructor
    Test(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return id + " " + name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Student {
    public static void main(String[] args) throws CloneNotSupportedException {
        // create an instance of Student
        Test s1 = new Test("Ashish", 121);

        // Try to clone s1 and assign
        // the new object to s2
        Test s2 = (Test) s1.clone();
        System.out.println(s1);
        System.out.println(s2);
    }
}