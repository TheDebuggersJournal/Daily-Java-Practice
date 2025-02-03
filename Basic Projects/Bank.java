package wipropart1day3;

abstract class BankAccount {
	protected String accountnumber;
	protected String accountholdername;
	protected double balance;
	
	//Constructor
	public BankAccount(String accountNumber, String accountHolderName) {
		this.accountnumber = accountNumber;
		this.accountholdername = accountHolderName;
		this.balance = 0;
	}
	
	public abstract double calculateInterest();
	
	//deposit money
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: "+ amount + " New Balance: " + balance);
		}
		else {
			System.out.println("Invalid deposit amount.");
		}
	}
	
	//withdraw money
	public void withdraw(double amount) {
		if (amount > 0) {
			if (balance >= amount) {
				balance -= amount;
				System.out.println("Withdrawn: "+ amount + "Remaining Balance: ");
			}else {
				System.out.println("Insufficiant funds.");
			}
		}else {
			System.out.println("Invalid withdrawal Amount.");
		}
	}
	
	public void displayAccountDetails() {
		System.out.println("Account Number: "+ accountnumber);
		System.out.println("Account Holder: "+ accountholdername);
		System.out.println("Balance: "+balance);
	}
}

class SavingsAccount extends BankAccount {
	private double interestRate;
	
	public SavingsAccount(String accountnumber, String accountholdername, double interestRate) {
		super(accountnumber, accountholdername);
		this.interestRate = interestRate;
	}
	
	@Override
	public double calculateInterest() {
		return balance * interestRate /100;
	}
}

//Concrete class CheckingAccount
class CheckingAccount extends BankAccount{
	private double overdraftLimit;
	
	public CheckingAccount(String accountnumber, String accountholdername, double overdraftLimit) {
		super(accountnumber, accountholdername);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if (amount > 0) {
			if (balance + overdraftLimit >= amount) {
				balance -= amount;
				System.out.println("Withdrawn: " + amount + "Remaining Balance: ");
			}else {
				System.out.println("Exceeded overdraft limit!");
			}
		}else {
			System.out.println("Invalid withdrawal amount.");
		}
	}
	@Override
	public double calculateInterest() {
		return 0;
	}
}

public class Bank {

	public static void main(String[] args) {
		
		//Create a savings account with 5% 
		SavingsAccount savings = new SavingsAccount("SA12345","John Doe",5);
		savings.deposit(1000);
		System.out.println("Interest Earned: "+ savings.calculateInterest());
		
		//Create a checking account with an overdraft limit of 500
		CheckingAccount checking = new CheckingAccount("CA67890","Jane Smith", 500);
		checking.deposit(500);
		checking.withdraw(900);  // Will work because of overdraft
		checking.withdraw(200);  //Will fail
		
		//Displaying final details
		System.out.println("\nFinal Account Details: ");
		savings.displayAccountDetails();
		savings.displayAccountDetails();
		
	}

}
