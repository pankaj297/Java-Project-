package Loops;

public class demo7 {

	public static void main(String[] args) {
		// Count digits in a number
		int num = 12345, count = 0;
		while (num != 0) {
		    num /= 10;
		    count++;
		}
		System.out.println("Digits = " + count);

	}

}
