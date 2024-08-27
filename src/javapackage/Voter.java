package javapackage;

import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
		Scanner age = new Scanner(System.in);
		System.out.println("enter the DOB");

		int DOB = age.nextInt();

		if (DOB >= 18) {
			System.out.println("You are eligible");
		} else {
			System.out.println("You are not eligible");
		}
	}

}
