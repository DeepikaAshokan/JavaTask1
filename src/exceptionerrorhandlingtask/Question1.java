package exceptionerrorhandlingtask;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ae) {
			System.out.println("A number cannot be divided by ZERO");

		}

	}

}
