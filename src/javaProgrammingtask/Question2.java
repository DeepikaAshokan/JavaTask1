package javaProgrammingtask;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a word");

		String str = sc.next();

		char ch;

		String reverse = "";

		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);

			reverse = ch + reverse;

		}
		System.out.println("The reverse is " + reverse);

	}

}
