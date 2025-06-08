package ConditionalStatements;

import java.util.Scanner;

public class demo4 {
    
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Leap Year
		System.out.println("Enter the Year : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		int year = sc.nextInt();
		
		if(year % 4 == 0) {
			System.out.println("This is leap year...!");
		}
		else if(year % 100 != 0) {
			System.out.println("This is not Leap Year");
		}
		else if(year % 400 == 0) {
			System.out.println("This is Leap Year...!");
		  }
		else {
			System.out.println("This is not leap year");
		}
	}
}

