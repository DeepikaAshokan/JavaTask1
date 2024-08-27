package javapackage;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A");

	int a = sc.nextInt();
		System.out.println("Enter the value of B");

		int b = sc.nextInt();
		System.out.println("Addition: " + (a + b));
		System.out.println("Subtraction: " + (a - b));
		System.out.println("Multiplication:" + (a * b));
		System.out.println("Division:" + (a / b));
	}

}
