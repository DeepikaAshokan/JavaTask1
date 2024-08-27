package javatask;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("This is an EVEN number");
		} else
			System.out.println("This is a ODD number");
	}

}
