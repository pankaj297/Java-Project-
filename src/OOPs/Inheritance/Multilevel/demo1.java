package OOPs.Inheritance.Multilevel;


class Shape{
	public void area() {
		System.out.println("Display The Area...!");
	}
	
}

class Triangle extends Shape{
	public void area(int l, int h) {
		double result = 0.5 * l * h;
		System.out.println("Area Of Triangle : " + result);
	}
}

//Multilevel inheritance
class EquilateralTriangle extends Triangle{
	public void area(int side) {
		 double result = (Math.sqrt(3) / 4) * side * side;
	     System.out.println("Area of Equilateral Triangle: " + result);
	}
}

public class demo1 {

	public static void main(String[] args) {
		// Multilevel inheritance 
		// Multilevel inheritance is a process of deriving a class from another derived class.

		EquilateralTriangle e1 = new EquilateralTriangle();
		e1.area();
		e1.area(10,5);
		e1.area(6); 

	 
	}

}
