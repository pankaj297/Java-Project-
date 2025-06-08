package OOPs;

class Student1{
	//Variable
	String name;
	
	//constractor
	Student1(String name){
		this.name = name;
	}
	
	//Function
	void show() {
		System.out.println(name);
	}
	
}
public class demo4 {

	public static void main(String[] args) {
		// ✅ 7. Use ‘this’ keyword to resolve variable name conflict.
 
		Student1 s1 = new Student1("Pankaj");
		
		s1.show();
      

	}

}
