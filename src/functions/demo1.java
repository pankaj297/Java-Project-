package functions;

import java.util.Scanner;

public class demo1 {
	
	public static void PrintMyName(String name) {
		System.out.println(name);
		return;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// functions
		
	   System.out.println("Enter the Name : ");
	   Scanner sc = new Scanner (System.in);
	   String name = sc.nextLine();
	   
	   PrintMyName(name);
		

	}

}
