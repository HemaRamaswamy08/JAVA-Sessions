package bank_example_super;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount savingsAccount = new SavingsAccount("98765345", "Hema", 80000, 10);
		savingsAccount.display();

		System.out.println("---------------------");
		System.err.println("Salary Account");

		SalaryAccount salaryAccount = new SalaryAccount("1234567", "nisha", 0);
		salaryAccount.display();

		System.out.println("------------------");

		// UpCasting -> from salaryAccount (child class) to BankAccount (parent Class)
		BankAccount aliceAccount = new SalaryAccount("08639578372", "Alice", 100);
		aliceAccount.display();
		
		System.err.println("-------------------------");
		System.out.println("Down cast");
		hello(aliceAccount);
		System.out.println("-------------------------");
		
		//ClassCastException -->here we are converting savings account to salary account which are not 
		// related at all so runtime exception will occur
		System.err.println(" ClassCastException ");
//		BankAccount bobAccount = new SavingsAccount("08639578372", "Alice", 100,1000);
//		hello(bobAccount);

	}

	// down cast -->call this method inside a main
	public static void hello(BankAccount bankAccount) {
		// bankAccount(parent class) is manually converting into SalaryAccount(child class)
		SalaryAccount account = (SalaryAccount) bankAccount;
		account.display();
	}

}
