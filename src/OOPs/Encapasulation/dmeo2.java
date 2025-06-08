package OOPs.Encapasulation;

//Define a class named BankAccount (Blueprint for bank accounts)
class BankAccount{
	
	// Private data member to hold the balance (Encapsulation)
	private int balance = 0;
	
	// Method to deposit money into the account
	public void deposit(int amount) {
		balance += amount; // Add amount to the current balance
		System.out.println("Deposited : "+ amount); // Print deposited amount
	}
	
	 // Method to withdraw money from the account
	public void withdraw(int amount) {
	
		// Check if sufficient balance is available
		if(amount <= balance) {
			balance -= amount;  // Subtract amount from balance
			System.out.println("Withdraw Amount : "+ amount); // Print withdrawn amount
		}else {
			System.out.println("Insufficient Balance...!"); // Error message if not enough balance
		}
	}
	
	// Method to display the current balance
	public void showBalance() {
		System.out.println("Balance : " + balance); // show current balance
	}
	
}

// demo2 class to test the BankAccount functionality
public class dmeo2 {

	
	public static void main(String[] args) {
		// ✅ 1. Create a class for a Bank Account with deposit and withdraw methods.

		// Create an object 'acc' of BankAccount (Object creation)
		BankAccount bank1 = new BankAccount();
		bank1.deposit(10000);  // Deposit ₹1000
		bank1.withdraw(500);  // Withdraw ₹500
		bank1.showBalance();  //  Display remaining balance
		
	}

}
