package OOPs.Polymorphism;

class Calculator {
	
	int add(int a, int b) {
		return a + b;
	}
	
	double add(double a, double b) {
		return a + b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
	}
	
}

public class demo2 {

	public static void main(String[] args) {
		// ✅ 2. Demonstrate Method Overloading with a Calculator class.
		
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(5, 6));
		System.out.println(cal.add(5.3, 2.5));
		System.out.println(cal.add(5, 6, 8));
		
	}

}
