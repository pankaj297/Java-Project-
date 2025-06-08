package Arrays;

import java.util.Scanner;

public class demo4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Array input form user
		
		System.out.println("Enter the Array size");
		Scanner sc = new Scanner (System.in);
		
		int size = sc.nextInt();
		
		int numbers[] = new int[size];
		
		System.out.println("Enter the Aray");
		for(int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		
		for(int i = 0; i < size; i++) {
			System.out.print(" "+ numbers[i]);
		}

	}

}
