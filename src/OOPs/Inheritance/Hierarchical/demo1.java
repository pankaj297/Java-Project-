package OOPs.Inheritance.Hierarchical;

class Shape{
	public void area() {
		System.out.println("Dispay The Area...!");
	}
}

class Triangle extends Shape{
	public void area(int l, int h) {
		double result = 0.5 * l * h;
		System.out.println("Area Of Triangle : "+ result);
	}
}

//Hierarchical inheritance 
class Cricle extends Shape{
	public void area(int r) {
		double result = 3.14 * r * r;
		System.out.println("Area Of Cricle : "+ result);
	}
}


public class demo1 {
	

	public static void main(String[] args) {
		//  Hierarchical inheritance : 
		//Hierarchical inheritance is defined as the process of deriving more than one 
		// class from a base class.
		
		Triangle t1 = new Triangle();
		t1.area();
		t1.area(10,5);
		
		Cricle c1 = new Cricle();
		c1.area();
		c1.area(10);

	}

}
