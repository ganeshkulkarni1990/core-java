package com.abc.oops;

class Vehicle {
    public void start(){
        System.out.println("com.abc.oops.Vehicle Started");
    }
    public void stop(){
        System.out.println("com.abc.oops.Vehicle Stopped");
    }
    public void engine(){
        System.out.println("com.abc.oops.Vehicle Engine Added");
    }

    public void Test() {
        System.out.println("com.abc.oops.Vehicle Test Method called");
    }
}

class FourWheeler extends Vehicle {
    public void start() {
        System.out.println("com.abc.oops.FourWheeler Started");
    }

    public void stop() {
        System.out.println("com.abc.oops.FourWheeler Stopped");
    }

    public void engine() {
        System.out.println("com.abc.oops.FourWheeler Engine Added");
    }

    public String toString(){
        return "com.abc.oops.FourWheeler";
    }
}


class ThreeWheeler extends Vehicle {
    public void start() {
        System.out.println("com.abc.oops.ThreeWheeler Started");
    }


    public void stop() {
        System.out.println("com.abc.oops.ThreeWheeler Stopped");
    }


    public void engine() {
        System.out.println("com.abc.oops.ThreeWheeler Engine Added");
    }

    public String toString(){
        return "com.abc.oops.ThreeWheeler";
    }
}


public class InteritanceDemo {
    public static void main(String ...args){
        Vehicle v = new FourWheeler();
        v.start();
        v.stop();
        v.engine();
        v.Test();

        Vehicle v2 = new ThreeWheeler();
        v2.start();
        v2.stop();
        v2.engine();
        v2.Test();

        Vehicle v3 = new Vehicle();
        v3.start();
        v3.stop();
        v3.engine();
        v3.Test();

        System.out.println(v3);

    }
}
