package Arrays;

import java.util.Scanner;

public class demo5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 

	  System.out.println("Enter The Size Of Array : ");
	  Scanner sc = new Scanner(System.in);
	  
	  int size = sc.nextInt();
	  
	  int[] num = new int[size];
	  
	  
	  System.out.println("Enter the Array Elements : ");
	  
	  for(int i = 0; i<size; i++) {
		  num[i] = sc.nextInt();
	  }
	  
	  System.out.println("Enter the Which Number index You Have : ");
	  int x = sc.nextInt();
	  
	  for(int i = 0; i < num.length; i++) {
		  if(num[i] == x) {
			  System.out.println("X found at index : "+ i);
		  }
	  }
	  
	}
}
