package Chapter6;

public class TestBank {
	public static void main(String[] args){

		BankAccount account = new BankAccount("Hector",5.0);

		System.out.println(account.toString());

		account.deposit(5);

		account.toString();

		account.withdrawal(15);

		account.withdrawal(3);

		account.checkBal();

		account.toString();

	}
}
