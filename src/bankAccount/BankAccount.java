package bankAccount;

import java.util.Random;

public class BankAccount {
	private Integer numberOfBankAccounts = 0;
	private Double totalAmmountInBank = 0.0;
	protected String name;
	protected String accountNumber;
	protected Double balance;
	protected Double savings;

	public BankAccount(String name) {
		this.name = name;
		this.accountNumber = accountNumber();
		this.balance = 0.0;
		this.savings = 0.0;
		numberOfBankAccounts++;

	}

	private String accountNumber() {
		String aBC = "abcdefghijklmnopqrstuvwxyz";
		Random rand = new Random();
		String accountNumber = "";
		String temp = "";
		for (int j = 0; j < 10; j++) {
			temp += aBC.charAt(rand.nextInt(26));
		}
		accountNumber = temp;

		return accountNumber;

	}

	public String toString() {
		String output = "";
		output += "Name:           " + name + "\n";
		output += "Account Number: " + accountNumber + "\n";
		output += "Balance: 	   " + balance + "\n";
		output += "Savings:        " + savings + "\n";

		return output;
	}

	public void makeDeposit(String checking, Double money) {
		if (checking == "checking") {
			this.balance += money;
			totalAmmountInBank += money;
			System.out.println("*****************************************************" + "\n" + "Welcome " + this.name
					+ " looks like you have deposited " + money + "$ into your checking account. Your balance is: "
					+ this.balance + "\n" + "*****************************************************");
		} else {
			this.savings += money;
			totalAmmountInBank += money;
			System.out.println("*****************************************************" + "\n" + "Welcome " + this.name
					+ " looks like you have deposited " + money + "$ into your savings account. Your balance is: "
					+ this.savings + "in savings" + "\n" + "*****************************************************");
		}

	}

	public void makeWithdraw(String account, Double money) {
		if (account == "savings") {
			Double temp = (this.savings - money);
			if (temp < 0) {
				System.out.println("*****************************************************" + "\n" + "sorry " + this.name
						+ " you do not have the funds to complete this transaction " + this.savings + "\n"
						+ "*****************************************************");
			} else {
				this.savings += -money;
				totalAmmountInBank += -money;
				System.out.println("*****************************************************" + "\n" + "Welcome "
						+ this.name + " looks like you have withdrew " + money
						+ "$ form your savings account. Your balance is: " + this.savings + "\n"
						+ "*****************************************************");
			}

		} else {
			Double temp = (this.balance += -money);
			if (temp > 0) {
				System.out.println("*****************************************************" + "\n" + "sorry " + this.name
						+ " you do not have the funds to complete this transaction" + this.balance + "\n"
						+ "*****************************************************");
			} else {
				this.balance += -money;
				totalAmmountInBank += -money;
				System.out.println("*****************************************************" + "\n" + "Welcome "
						+ this.name + " looks like you have withdrew " + money
						+ "$ form your checking account. Your balance is: " + this.balance + "\n"
						+ "*****************************************************");
			}
		}

	}

	public void checkAccounts() {
		System.out.println("*****************************************************" + "\n" + "Welcome " + this.name
				+ " looks like you have " + this.balance + "$ in your checking account " + "\n" + "You also have "
				+ this.savings + " in your savings account today." + "\n"
				+ "*****************************************************");
	}

	public String getAccNum() {
		return accountNumber;
	}

	public void setAccNum(String accNum) {
		this.accountNumber = accNum;
	}

	public Double getBal() {
		return balance;
	}

	public void setBal(Double bal) {
		this.balance = bal;
	}

	public Double getSavings() {
		return savings;
	}

	public void setSavings(Double save) {
		this.savings = save;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
