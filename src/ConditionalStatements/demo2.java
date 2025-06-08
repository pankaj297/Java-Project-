package ConditionalStatements;

import java.util.*;

public class demo2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Write an if-else condition to check if a number is even or odd
	
	   System.out.println("Enter the Number : ");
	   Scanner sc = new Scanner(System.in);
	   
	   int num = sc.nextInt();
	   
	   
	   if(num % 2 == 0) {
		   System.out.println("This is Even Number. . .!");
	   }else if(num % 2 != 0) {
		   System.out.println("This is Odd Number. . .!");
	   }else {
		   System.out.println("This Number Invalid ");
	   }
	}
}
