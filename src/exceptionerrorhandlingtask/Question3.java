package exceptionerrorhandlingtask;

import java.util.Scanner;

class InvalidAgeException extends Exception {

	InvalidAgeException(String str) {

		System.out.println(str);
	}
}

public class Question3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");

		int age = sc.nextInt();

		try {
			drive(age);
		}

		catch (Exception e) {
			System.out.println("Age must be 18");
		}
	}

	public static void drive(int age) throws Exception {

		if (age < 18) {

			throw new InvalidAgeException("Not eligible");
		}

		else {

			System.out.println("Eligible");
		}
	}
}
