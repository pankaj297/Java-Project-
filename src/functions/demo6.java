package functions;

import java.util.Scanner;

public class demo6 {

	public static String reverseStr(String str) {
		String rev = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Reverse String
		
		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String result = reverseStr(str);
		
		System.out.println(result);

	}

}
