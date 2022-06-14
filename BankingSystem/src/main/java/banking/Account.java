package banking;

/**
 * Abstract bank account class.<br>
 * <br>
 *
 * Private Variables:<br>
 * {@link #accountHolder}: AccountHolder<br>
 * {@link #accountNumber}: Long<br>
 * {@link #pin}: int<br>
 * {@link #balance}: double
 */
public abstract class Account {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.pin=pin;
		this.startingDeposit=startingDeposit;
	}

	public AccountHolder getAccountHolder() {
		// complete the function
        return null;
	}

	public boolean validatePin(int attemptedPin) {
		// complete the function
        return true;
	}

	public double getBalance() {
		return balance;
        return -1;
	}

	public Long getAccountNumber() {
		// complete the function
        return -1L;
	}

	public void creditAccount(double amount) {
		// complete the function
	}

	public boolean debitAccount(double amount) {
		// complete the function
        return true;
	}
}
