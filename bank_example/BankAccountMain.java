package bank_example;

public class BankAccountMain {

	public static void main(String[] args) {
		Bank hemasBank = new Bank("Hema", 98765432);

		System.out.println("Name of accountent :" + hemasBank.name);
		System.out.println("Account number :" + hemasBank.getAccNum());
		System.out.println("Balance :" + hemasBank.getBalance());

		Bank nishasBank = new Bank("Nisha", 12345678, 80000);

		System.out.println("Name of accountent :" + nishasBank.name);
		System.out.println("Account number :" + nishasBank.getAccNum());
		System.out.println("Balance :" + nishasBank.getBalance());

		nishasBank.deposit(40000);
		System.out.println("Balance :" + nishasBank.getBalance());

		nishasBank.withdraw(1500000);
		nishasBank.withdraw(20000);
		System.out.println("Balance after withdrawl :" + nishasBank.getBalance());

	}

}
