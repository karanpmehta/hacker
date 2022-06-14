package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;

	public Bank(LinkedHashMap<Long,Account> accounts) {
		this.accounts=accounts;
		
	}

	private Account getAccount(Long accountNumber) {
		Account acc = accounts.get(accountNumber);
        return acc;
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
        return -1L;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
        return -1L;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
        return true;
	}

	public double getBalance(Long accountNumber) {
		Account acc= accounts.get(accountNumber);
		double bal = acc.getBalance();
        return bal;
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
        return true;
	}
}
