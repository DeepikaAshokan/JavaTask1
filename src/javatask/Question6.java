package javatask;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int A = sc.nextInt();

		int fact = 1;

		for (int i = 1; i <= A; ++i) {

			fact = fact * i;

		}

		System.out.println("The Factorial of the number is " + fact);

	}

}
