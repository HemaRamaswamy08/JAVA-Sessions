package bank_example;

public class Bank {
	private long accNum;
	public String name;
	private float balance;

	public Bank(String name, long accNum) {
		this.name = name;
		this.accNum = accNum;
	}

	public Bank(String name, long accNum, float balance) {
		this.name = name;
		this.accNum = accNum;
		this.balance = balance;
	}

	public float deposit(float amount) {
		balance += amount;
		return balance;
	}

	public long getAccNum() {
		return accNum;
	}

	public float getBalance() {
		return balance;
	}

	public void withdraw(float amount) {
		if ((this.balance - amount) < 0) {
			System.out.println("Indufficient balance");
		} else {
			this.balance -= amount;
			System.out.println("succesfull");
		}
	}

}
