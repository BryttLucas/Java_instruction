public class Account implements Depositable, Withdrawable, Balanceable {
	private double balance;
	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		this.balance = amount;

	}

	@Override
	public void withdraw(double amount) {
		balance =- amount;

	}

	@Override
	public void deposit(double amount) {
		balance =+ amount;

	}

}
