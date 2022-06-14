package entities;

public class Account {

	private static final double TAX_WITHDRAW = 5.00; 
	
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public Account(int accountNumber, String accountHolder, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(accountBalance);
	}
	
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void deposit(double deposit) {
		accountBalance += deposit;
	}
	
	public void withdraw(double withdraw) {
		accountBalance -= withdraw + TAX_WITHDRAW;
	}
	
	@Override
	public String toString() {
		return "Account " + accountNumber 
				+ ", Holder: " + accountHolder + ", "
				+ String.format("Balance: $ %.2f%n", accountBalance);
	}
}
