package OOPs;


class Students{
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	
	//Student() is a special type function that call constructor 
		// constructor  means construct object /  someting create
		// There are 3 types of constructor 
		// constructor name and class name are same
		
	// 1] non Parameterized Constructor - mean they not have parameters
	
//	Student(){
//		System.out.println("Constructor called");
//	}

	
	
	// 2] Parameterized Constructor
//	Students(String name, int age){
//		this.name = name;
//		this.age = age;
//		
//	}
	
//	3] Copy Constructor
	
	Students(Students s2){
		this.name = s2.name;
		this.age = s2.age;
	}
	
	Students(){
		
	}
	
	
}
public class demo3 {

	public static void main(String[] args) {
		//  OOPs Ex -  Class and Object and constructor
		
		
		//Object Create
//		1] non Parameterized Constructor
//		Students s1 = new Students();
//		s1.printInfo();

		//Object Create
//		2]Parameterized Constructor
//		Students s1 = new Students("Pankaj", 21);
//		s1.printInfo();
		
		
		//Object Create
//		3] Copy Constructor
		Students s1 = new Students();
		s1.name = "pankaj";
		s1.age = 21;
		
		Students s2 = new Students(s1);
		s2.printInfo();
	

		
		

	}

}
