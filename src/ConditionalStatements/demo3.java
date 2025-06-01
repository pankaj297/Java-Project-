package ConditionalStatements;

import java.util.Scanner;

public class demo3 {
	
  public static void main(String[] args) {
	  
	  //Check eligibility to vote
	  System.out.println("Enter The Age : ");
	  Scanner sc = new Scanner (System.in);
	  
	  int age = sc.nextInt();
	  
	  if(age >= 18) {
		  System.out.println("You Can Vote...!");
	  }else {
		  System.out.println("You Can't Vote...!");
	  }
	  
  }
}
