package javaOOPS;

import java.util.Scanner;

public class Account {

	Scanner sc = new Scanner(System.in);
	int balance = sc.nextInt();
	int withdraw;
	int deposit;
	int currentbalance;

	public void Account() {
		System.out.println("The Account balance is :" + balance);
	}

	public void Account(int a, int b) {
		this.withdraw = a;
		this.deposit = b;
		currentbalance = balance - withdraw + deposit;
	}

	public void write() {
		System.out.println("The current Balance in the account is : " + currentbalance);
	}

	public static void main(String[] args) {

		Account obj = new Account();
		obj.Account();
		obj.Account(500, 100);
		obj.write();

	}

}
