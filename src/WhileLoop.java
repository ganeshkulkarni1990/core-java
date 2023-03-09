class Address {
    String lane;
    String landMark;

    String pinCode;

    public Address(String lane, String landMark, String pinCode) {
        this.lane = lane ;
        this.landMark = landMark;
        this.pinCode = pinCode;
    }

    public String toString() {
        return "{" + this.lane + " " + this.landMark + " " + this.pinCode + "}";
    }

}
class Student {
    String name;
    int id;
    Address address;

    public Student(String name, int id, Address address){
        this.name = name;
        this.id = id;
        this.address = address;
    }
}

public class WhileLoop {
    static long i;
    static char c;

    static {
        i = 3;
        c = 'z';
    }

    static {
        i = 7;
        c = 'a';
    }
    static void whileLoop(int n){
        while(i <= n) {
            System.out.println(i);
            if (i == 8) {
                break;
            }
            i++;
        }
        System.out.println(c);
    }

    static void doWhileLoop(int n){
        int i = 0 ;
        do {
            //logic
             if(i % 2 == 0){
                 continue;
             }
             System.out.println(i);
        }while(i++ <= n);
    }
    public static void main(String ...args) {
        whileLoop(10);
        doWhileLoop(10);
        Student s = new Student("Sakshi", 100, new Address("Vidya Nagar" , "Mbad", "422003"));
        System.out.println(s.name + " " + s.id + " " + s.address);

        int []a = new int[10];
        boolean []b = new boolean[10];
        b[2] = true;
        for(boolean element: b) {
            System.out.println(element);
        }

        int [][][]matrix = new int[3][3][3];
        for(int d[][]: matrix) {
            for (int[] c : d) {
                for (int element : c) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

//static and objects data is by default initialised to data types default value
//default values
//int 0
//long 0
//float 0.0f
//double 0.0d
//boolean false
//char ..
//short 0
//byte 0
//Objects null

//static variable
//static method
//static block
//static context/ class level
//
//on class load static context is created


//array char array int array
// compile time known memory