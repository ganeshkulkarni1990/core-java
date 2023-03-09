import com.abc.Employee;
import com.abc.*;
public class InheritanceExtended {
    public static void main(String ...args){
      Person p = new GoogleEmployee(10, "Abc", 400000, 10000);
      System.out.println(p.toString());
      //p.doWork();
    }
}

//private --> only self class
//public --> all
//protected --> child classes + same package
//default -- same package



//use of super -->
// call the methods of the immediate parent

//if no constructor is defined in the class then jvm add default constructor
//otherwise jvm will not add any constructor


//constructors are special methods without return type and name same a className

//super constructor if using then it should be first line in constructor

