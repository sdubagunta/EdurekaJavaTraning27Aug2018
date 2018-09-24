import java.util.Scanner;

abstract class Account {
	int Acct_num;
	String Name;
	double Amount;

	void display_bal() {
		System.out.println("Account balance is" + Amount);
	}
	void withdraw() {

	}

	void deposit() {

	}

	void Account_details(int a, String name, double bal) {
		System.out.println("Account       Name        Balance");
		System.out.println(+a      +name       +bal);
	}
}

class SBAccount extends Account {
	double interest = 0.4;

	void Create_account(int a) {
		System.out.println("Saving Account Created. Account number is: " +a);
	}

	void withdraw() {
		System.out.println("Enter amount to withdraw:");
		
		double newbal = bal - 
	}

	void deposit() {

	}

	void Account_details(int a, String name, double bal) {
		System.out.println("Account       Name        Balance");
		System.out.println(+a      +name       +bal);
	}
}

class current_Account extends Account {
	void Create_account(int a) {
		System.out.println("Current Account Created. Account number is: " +a);

	}

	void withdraw() {

	}

	void deposit() {

	}

	void Account_details() {

	}
}

public class Inheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name = sc.next();
		System.out.println("Enter the type of account to be created(Savings or Current):");
		String acct_typ = sc.next();
		System.out.println("Enter Account number:");
		int acc = sc.nextInt();

		SBAccount SB = new SBAccount();
		SB.withdraw();
		SB.deposit();
		SB.Account_details(acc, name, bal);
		current_Account CA = new current_Account();
		CA.withdraw();
		CA.deposit();

		if (acct_typ.equalsIgnoreCase("Savings")) {
			SB.Create_account(acc);
		} else if (acct_typ.equalsIgnoreCase("Current")) {
			CA.Create_account(acc);
		} else
			System.out.println("Please enter account type Savings or Current");

		
		sc.close();
	}

}
