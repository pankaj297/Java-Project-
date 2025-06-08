package OOPs;

//class
class Student{
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	
}
public class demo2 {

	public static void main(String[] args) {
		//  OOPs Ex -  Class and Object 

		//Object Create
		Student s1 = new Student();
		
		s1.name = "Pankaj";
		s1.age = 21;
		
		s1.printInfo();
		
		

	}

}
