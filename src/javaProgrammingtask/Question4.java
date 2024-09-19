package javaProgrammingtask;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows");

		int r = sc.nextInt();

		int c = 2;

		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		for (int i = (r - 1); i <= 1; i++) {

			for (int j = 1; j <= c; j++) {
				System.out.println("*" + " ");
			}
			System.out.println();

		}
	}

}
