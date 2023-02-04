
//keywords are not available to use for user
//reserved keywords

import java.io.*;

class Abc {
	int a;
	int b;
	static int c = 200;
	public Abc() {
		this.a = 100;
		this.b = 200;
	}

	public Abc(int sakshi, int vaishnavi){
		this.a = sakshi;
		this.b = vaishnavi;
	}

	public Abc(Abc abc){
		this.a = abc.a;
		this.b = abc.b;
	}

	int testA(){
		return a+b;
	}
}


class MathUtils {
	
	public int sum(int a, int b){
		return a+b;
	}
	public float sum(int a, int b, int c){
		return a+b;
	}
	public float sum(double a, double b){
		return a+b;
	}
	public double sum(double a, double b){
		return a+b;
	}

}
public class TestClass {
	
	public int a =10;
	public int b =20;
	private int c = 30; 

	public static void main(String ...args){
		// System.out.println("WELCOME TO CORE JAVA");
		// Abc a = new Abc(1, 2);
		// int c = a.testA();
		// System.out.println(c + " " + a.c);
		// Abc aa = new Abc();
		// int d = aa.testA();
		// System.out.println(d + " " + aa.c);
		// aa = new Abc(989898,1);
		// d = aa.testA();
		// System.out.println(d + " " + aa.c);


		MathUtils mathUtils = new MathUtils();

		int c = mathUtils.sum(10,20);
		System.out.println(c);

		float dd = mathUtils.sum(10.1f,20.1f);
		System.out.println(dd);

		double e = mathUtils.sum(10.0,20.0);
		System.out.println(e);

		System.out.println(Thread.currentThread());
	}

}

//Java is case sensitive langauge

//standard class name always starts with Capital Letter
//Camel Case


//how to use libraries or user defined libraries
//import 

//static methods can be used without creating object
//class vs object
//class is blueprint 
//object runtime entity 
//object --> instace 



///        firstName lastName mobileNo address identity dob gender

//coments 

//single line comment
/*

	Mutiple line comment
*/


/* 

.java it can any no of classes
but only 1 can public and name should be same as the public class
*/


/*

	public private protected default --> package level

	can be applicable to varibale, class, method, 
	static can be applicable to varible, class method
*/


///class Level --> static contect /class level data

//this is the current class


//Constructor --> construct or initialize the object 

//types of constructor
//default or no argument constructor
//parametrizied constructor
//copy constructor



//data type holds data float --smaller value which can hold by int

//method signature --> methodname, types of arguments and no of arguments --> 


