
class A {
	
}

class Student {
	private String name;
	private String address;
	private String id;
	
	public Student(String name, String address, String id){
		this.name = name;
		this.address = address;
		this.id = id;
	}
	
	public int hashCode(Student s) {
		return s.hashCode();
	}
	
//	public boolean equals(Student s) {
//		return this.name.equals(s.name) && this.address.equals(s.address) && this.id.equals(s.id);
//	}
	
	public String getName(){
		return this.name;
	}
	public String getId(){
		return this.id;
	}
	public String getAddress(){
		return this.address;
	}
	
//	public String toString(){
//		return "[name:"+this.name +" address:"+this.address +" id:"+this.id +"]";
//	}
}

//without constructor

public class DataTypes {
	public static void main(String...args){
//		String s = "sakshi1";
//		String s1 = "sakshi1";
//		
//		System.out.println(s.hashCode());
//		System.out.println(s1.hashCode());
//		
//		System.out.println(s == s1);
		
//		System.out.println(s);
//		
//		System.out.println(s.toString());
		
//		String s2 = new String("sakshi1");
//		
//		System.out.println(s2.hashCode());
//	
//		System.out.println(s1.equals(s2));
		
		Student student1 = new Student("sakshi","nashik","1");
		Student student2 = new Student("sakshi","nashik","1");
		
		System.out.println(student1);
		
//		System.out.println(student1.hashCode());
//		
//		System.out.println(student2.hashCode());
		
		System.out.println(student1.equals(student2));
		
		
		Object o = student1;
		System.out.println(o);
		
		String name = student1.getName();
		
		System.out.println(name);
		
	}
}
