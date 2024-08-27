package javatask;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Age of the person");

		int age = sc.nextInt();

		if (age >= 60) {

			System.out.println("He/She is a Senior Citizen");

		}

		else {
			System.out.println("He/She is Not a Senior Citizen");
		}
	}

}
