package Loops;

public class demo10 {

	public static void main(String[] args) {
		// Print all prime numbers between 1 and 50
		System.out.println("This is 1 to 50 Prime Numbers...!");
		for(int i = 2; i <= 50; i++) {
			
			boolean isPrime = true;
			
			for(int j = 2; j <= i / 2; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
		
			
			if(isPrime) {
				System.out.println(i);
			}
			
		}

	}

}
