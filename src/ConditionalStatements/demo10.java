package ConditionalStatements;

public class demo10 {

	public static void main(String[] args) {
		// Eligible for Loan or not
		int age = 25;
		int salary = 30000;
		boolean hasLoan = false;
		if (age > 21 && salary > 25000 && !hasLoan) {
		    System.out.println("Eligible for Loan");
		} else {
		    System.out.println("Not Eligible");
		}

	}

}
