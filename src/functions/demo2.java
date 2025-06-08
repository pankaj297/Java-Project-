package functions;

import java.util.Scanner;

public class demo2 {

	public static int CalculateSum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The Two Numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
       int sum =  CalculateSum(a,b);
       System.out.println("Sum Of Two Numbers : "+sum);
	}

}
