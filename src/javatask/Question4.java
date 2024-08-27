package javatask;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of A");
		int A = sc.nextInt();
		System.out.println("Enter the valur of B");
		int B = sc.nextInt();

		int swap = A;
		A = B;
		B = swap;

		System.out.println("OUTPUT:");
		System.out.println("Swapped value of A=" + A);
		System.out.println("Swapped value of B=" + B);
	}

}
