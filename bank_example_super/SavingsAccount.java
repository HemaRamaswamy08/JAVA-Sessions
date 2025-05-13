package bank_example_super;

public class SavingsAccount extends BankAccount {
	
	private double intrestRate;

	public SavingsAccount(String accountNumber, String accountHolder, double balance,double intrestRate) {
		super(accountNumber, accountHolder, balance);
		this.intrestRate=intrestRate;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Intrest Rate :" +intrestRate);
	}

}
