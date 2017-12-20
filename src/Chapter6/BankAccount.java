package Chapter6;

public class BankAccount {

	private double balance;
	private String name;

	public BankAccount(String nm, double initialBal){
		balance = initialBal;
		name = nm;
	}

	public String checkBal(){
		return ("Balance: $" + balance);
	}

	public String withdrawal(double amount){
		if (amount > balance){
			return ("Sorry you do not have the funds for that withdrawal");
		} else {
			balance = balance - amount;
			return ("Transaction Successful.");
		}
	}

	public String deposit(double amount){
		if (amount >= 0){
			balance = balance + amount;
			return ("Transaction Successful.");
		} else {
			return ("Error.");
		}
	}

	public String toString(){
		String str = "Name: " + name + "\n" + "Balance: $" + balance  + "\n";
		System.out.println(str);
		return (str);
	}

}
