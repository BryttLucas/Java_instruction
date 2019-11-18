package lucas.account;
import lucas.interFace.Balanceable;
import lucas.interFace.Depositeable;
import lucas.interFace.Withdrawable;

public class Account implements Depositeable, Withdrawable, Balanceable {

	protected double balance;
	
	public Account() {
		  super();
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		balance = amount;

	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;

	}
    @Override
	public void deposit(double amount) {
		balance += amount;

	

  }
}
