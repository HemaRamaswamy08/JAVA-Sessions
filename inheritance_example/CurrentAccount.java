package inheritance_example;

public class CurrentAccount extends BankAccount{
	
	@Override
	public void deposit() {
		System.out.println("Deposit to Current ");
	}

}
