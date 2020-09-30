package bankAccount;

public class BankTest {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("Robert");
		account1.toString();
		account1.makeDeposit("savings", 100.0);
		account1.checkAccounts();
		account1.makeWithdraw("savings", 200.0);
		account1.checkAccounts();
		System.out.println(account1);

	}
}