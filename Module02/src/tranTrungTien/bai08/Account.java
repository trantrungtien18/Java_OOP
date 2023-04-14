package tranTrungTien.bai08;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE = 0.035;

	public Account() {
		this.accountNumber = 999999;
		this.name = "Chua xac dinh";
		this.balance = 50000;
	}

	public Account(long accountNumber, String name, double balance) {
		setAccountNumber(accountNumber);
		setName(name);
		setBalance(balance);
	}

	public Account(long accountNumber, String name) {
		setAccountNumber(accountNumber);
		setName(name);
		setBalance(balance);
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		if (accountNumber <= 0)
			this.accountNumber = 999999;
		else
			this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.trim().equals(""))
			this.name = "Chua xac dinh";
		else
			this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance < 50000)
			this.balance = 50000;
		else
			this.balance = balance;
	}

	public double getRATE() {
		return RATE;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		} else
			return false;
	}

	public boolean withdraw(double amount, double fee) {
		if (amount > 0 && amount + fee <= balance) {
			balance -= (amount + fee);
			return true;
		} else
			return false;
	}

	public void addInterest() {
		balance += balance * RATE;
	}

	public boolean transfer(Account acc2, double amount) {
		if (amount > 0 && amount <= balance) {
			withdraw(amount, 0);
			acc2.deposit(amount);
			return true;
		} else
			return false;
	}

	public String toString() {
		Locale local = new Locale("vi", "vn");
		NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
		return String.format("%-20s%-20s%30s", accountNumber, name, formatter.format(balance));
	}
}
