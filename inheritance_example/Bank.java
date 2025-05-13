package inheritance_example;

public class Bank {
	
	public static void main(String[] args) {
		
		BankAccount savings = new BankAccount();
		savings.deposit();
		savings.withdrawl();
		System.out.println("---------------------------------");
		
		CurrentAccount currentAccount = new CurrentAccount();
		currentAccount.deposit();
		currentAccount.withdrawl();
		
	}

}
