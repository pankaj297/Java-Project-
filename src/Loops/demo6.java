package Loops;

public class demo6 {

	public static void main(String[] args) {
		// Find factorial of a number
		
		int fact = 1;
		int n = 5;
		
		for(int i = 1; i <= n; i++) {
			fact =  fact * i;
		}
		System.out.println("Factorial is : " + fact);

	}

}
