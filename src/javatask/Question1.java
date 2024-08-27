package javatask;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of A");
		int A = sc.nextInt();
		System.out.println("Enter the value of B");
		int B = sc.nextInt();
		System.out.println("Enter the value of C");
		int C = sc.nextInt();
		System.out.println("Enter the value of D");
		int D = sc.nextInt();

		if (A + B > C + D) {
			System.out.println("The sum of A and B is greater than the sum of C and D");
		}

	}

}
