
class Vehicle {
    public void start(){
        System.out.println("Vehicle Started");
    }
    public void stop(){
        System.out.println("Vehicle Stopped");
    }
    public void engine(){
        System.out.println("Vehicle Engine Added");
    }

    public void Test() {
        System.out.println("Vehicle Test Method called");
    }
}

class FourWheeler extends Vehicle {
    public void start() {
        System.out.println("FourWheeler Started");
    }

    public void stop() {
        System.out.println("FourWheeler Stopped");
    }

    public void engine() {
        System.out.println("FourWheeler Engine Added");
    }

    public String toString(){
        return "FourWheeler";
    }
}


class ThreeWheeler extends Vehicle {
    public void start() {
        System.out.println("ThreeWheeler Started");
    }


    public void stop() {
        System.out.println("ThreeWheeler Stopped");
    }


    public void engine() {
        System.out.println("ThreeWheeler Engine Added");
    }

    public String toString(){
        return "ThreeWheeler";
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
