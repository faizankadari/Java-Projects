package Project3;

import java.util.Scanner;

public class BankingApplication {
	public static void main(String[] args) {
		BankAccount obj1= new BankAccount("Xyz","!22x");
		obj1.showMenu();
	}
}

class BankAccount {
	int balance;
	int prevTranstion;
	String Custname;
	String custId;

	BankAccount(String cname, String cid) {
		Custname = cname;
		custId = cid;
	}

	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			prevTranstion = amount;

		}
	}

	void WithDraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			prevTranstion = -amount;

		}
	}

	void getPrevTransaction() {
		if (prevTranstion > 0) {
			System.out.println("Deposited " + prevTranstion);
		} else if (prevTranstion < 0) {
			System.out.println("Withdrawn " + Math.abs(prevTranstion));
		} else {
			System.out.println("No transcation Occured");

		}
	}

	void showMenu() {
		char opt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome " + Custname);
		System.out.println("Your ID is " + custId);
		System.out.println("\n");
		System.out.println("A Check balance");
		System.out.println("B Deposit");
		System.out.println("C Withdraw");
		System.out.println("D Previous");
		System.out.println("E Exit");

		do {
			System.out.println();
			System.out.println("Select an option");
			opt = sc.next().charAt(0);
			System.out.println("\n");
			switch (opt) {
			case 'A':
				System.out.println("Balance " + balance);
				break;
			case 'B':
				
				System.out.println("Enter amount" );
				int amount;
				amount = sc.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
			case 'C':
				System.out.println("Enter amount" );
				int amt;
				amt = sc.nextInt();
				System.out.println("Withdraw Amount " + amt);
				WithDraw(amt);
				break;
			case 'D':
				getPrevTransaction();
				break;
				
			case'E':
				System.out.println("***********");
				break;
			default:
				System.out.println("Invalid");
			}
		} while (opt != 'E');
		System.out.println("Thanks");
	}
}
