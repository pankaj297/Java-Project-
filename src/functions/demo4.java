package functions;

import java.util.Scanner;

public class demo4 {
	
	
	public static void printFactorial(int n) {
		
		if(n < 0) {
			System.out.println("Invalid Number");
			return;
		}
		
		int factorial = 1;
		
		for(int i = n; i >=1; i--) {
			factorial = factorial * i;
		}
		
		System.out.println(factorial);
		return;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Factorial
		
		System.out.println("Enter the number for factorial");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		 printFactorial(n);
	

	}

}
