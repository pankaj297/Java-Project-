package functions;

import java.util.Scanner;

public class demo7 {
	
	public static int findMax(int a, int b, int c) {
		if(a > b && a > c) {
			return a;
		}else if(b > a && b > c) {
		    return b;
		}else {
			return c;
		}
		
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Max number
		
	    System.out.println("Enter the Three Number : ");
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter A : ");
	    int a = sc.nextInt();
	    System.out.println("Enter B : ");
	    int b = sc.nextInt();
	    System.out.println("Enter C : ");
	    int c = sc.nextInt();
	    
	    
	    int Max = findMax(a,b,c);
	    System.out.println("Max : "+ Max);
	    
	}

}
