package OOPs.Inheritance.Single;

class Shape{
	public void area() {
		System.out.println("Displays the Area...!");
	}
	
} 

class Triangle extends Shape{
		public void area(int l, int h) {
			 double result = 0.5 * l * h;
		     System.out.println("Area of Triangle: " + result);
			
		}
	}

public class demo1 {

	public static void main(String[] args) {
		// Single Inheritance
		//: When one class inherits another class, it is known as single level inheritance
		
		Triangle t1 = new Triangle();
		t1.area();
		t1.area(10, 5);

	}

}
