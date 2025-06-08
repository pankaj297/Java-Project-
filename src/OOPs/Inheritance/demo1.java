package OOPs.Inheritance;

class Shape{
	String color;
}

// in java 'extends' keyword used for inherit the class
class Triangle extends Shape{
	
}

public class demo1 {

	public static void main(String[] args) {
		// Inheritance  - 4 types
		
		// 1] Single Inheritance (One class inherits from another)

		// 2] Multilevel Inheritance (Class inherits from a derived class)

		// 3] Hierarchical Inheritance (Multiple classes inherit from one base class)
		
		// 4] Hybrid inheritance
		
		
		Triangle t1 = new Triangle();
		t1.color = "pink";
		
		
	}

}
