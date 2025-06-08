package functions;

import java.util.Scanner;

public class demo3 {
	
	public static int MultipleTwoNum(int a, int b) {
	     int multi = a * b;
	     return multi;
		
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// multiple two numbers
		System.out.println("Enter the Two Number : ");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
	   int multi =	MultipleTwoNum(a,b);
	   System.out.println("Multiple Of Two Numbers : "+ multi);
		

	}

}
