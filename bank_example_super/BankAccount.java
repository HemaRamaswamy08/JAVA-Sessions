package bank_example_super;

public class BankAccount {

	private String accountNumber;
	private String accountHolder;
	private double balance;

	public BankAccount(String accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public void display() {
		System.out.println("Account Number :" + accountNumber);
		System.out.println("Account Holder :" + accountHolder);
		System.out.println("Balance :" + balance);
	}

}
