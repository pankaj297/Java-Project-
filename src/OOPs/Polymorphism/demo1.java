package OOPs.Polymorphism;

class Student{
	String name;
	int age;
	
	//Same function used for different purpose 
	// Ex - Polymorphism - Overloading
	public void printInfo(String name) {
		System.out.println(name);
	}
	
	public void printInfo(int age) {
		System.out.println(age);
	}
	
	public void printInfo(String name, int age) {
		System.out.println(name + " " + age);
	}
	
}

public class demo1 {
	

	public static void main(String[] args) {
		// Polymorphism - Poly means ‘many’ and morphism means ‘forms’.
		// Types of Polymorphism IMP📝‼️
		// 1. Compile Time Polymorphism (Static) : Method Overloading 
		// 2. Runtime Polymorphism (Dynamic) :  Function overriding 

		Student s1 = new Student();
		s1.name = "Pankaj";
		s1.age = 21;
		
		s1.printInfo(s1.name, s1.age);
             
		
		
	}

}
