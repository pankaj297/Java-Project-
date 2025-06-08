package Loops;

public class demo11 {

	public static void main(String[] args) {
		// 
		
		int a = 0; int b = 1;
		
		System.out.println(a+"\n"+b);
		for(int i = 1; i <= 12; i++) {
		   int c = a + b;
		    System.out.println(c);
		   
		    a = b;
		    b = c;
		}

	}

}

//0 1 1 2 3 5 8 13 21 34 55 89 144 233