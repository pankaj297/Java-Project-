package functions;

import java.util.Scanner;

public class demo5 {

	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Even odd

		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean Even = isEven(n);
		System.out.println(Even);
	}

}
