
class AA {
	static void testMethod(){
		VariableScope.test(1000);
	}
}
public class VariableScope {
	static void test(int a) {
		int c = 100;
		if (a <= 100) {
			System.out.println("a: " + a+c);
			//this can be any operation
		} else if(a > 1000) {
			System.out.println("a: " + a+c);
			System.out.println("a: " + (a - 100));
		} else {
			System.out.println("a : " + a % 99);
		}
	}
	//c

	boolean isPowerOfTwo(int n){
		if((n & (n-1)) == 0) { 
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String... args) {
		int a = 20;
		System.out.println(--a);
		System.out.println(a);
		// block start
		  //block end ---> stack frame in stack
		// b scope end here
		//System.out.println(a);
		// System.out.println(b);
		
//		test(200);
//		test(10);
//		test(400);
//		AA.testMethod();
//		a = 10; // 10000
//		boolean b = (a == 10) && (true); // 1010 
//		//System.out.println(b);
//		VariableScope variableScope = new VariableScope();
//		variableScope.test(4000);
//		boolean c = variableScope.isPowerOfTwo(16);
//		System.out.println(c);
//		System.out.println(variableScope.isPowerOfTwo(160));
//		System.out.println(variableScope.isPowerOfTwo(32));
//		System.out.println(variableScope.isPowerOfTwo(17));
	}
	// > < == != >= <= 
	// Assignment operator =
	//
	// -=
	
	//a += 10; --> a = a + 10;
	//a -= 10 --> a = a -10;
	// a /= 10 --> a = a /10;
	// a *= 10 --> a = a * 10;
	// a scopes end here
	
	// bit wise operator
	//& | ^ ^^ --> bit wise
	// && logical and 
	// || logical or
	// 10000 & 1010 --> 00000
	
	//given a number tell me if number of power of 2 or not
	//if no is power of 2 -->true else return false
	//eg 16 --> true
	// eg 20 --> false
	//32 --> true
	//128 --> true
	//130 --> false
	//15 --> false
	
	//Algorithm
	//16384 --> true
	//8192 --> true
	
	// 10
	// 100
	// 1000
	// 10000
	// 10000	
}
