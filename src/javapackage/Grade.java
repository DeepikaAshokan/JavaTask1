package javapackage;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		System.out.println("Enter the Grade");

		Scanner sc = new Scanner(System.in);

		char grade = sc.nextLine().charAt(0);

		switch (grade) {

		case 'A':
			System.out.println("Excellant");
			break;

		case 'B':
			System.out.println("Well Done");
			break;

		case 'C':
			System.out.println("Passed");
			break;

		case 'D':
			System.out.println("Better Try Again");
			break;

		default:
			System.out.println("Invalid Grade");

		}

	}

}
