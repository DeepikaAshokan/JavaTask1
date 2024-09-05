package javaProgrammingtask;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a word");

		String str = sc.next();

		String revstr = "";

		int strlenght = str.length();

		for (int i = (strlenght - 1); i <= 0; --i) {

			revstr = revstr + str.charAt(i);
		}
		if ((str.toLowerCase()).equals(revstr.toLowerCase())) {

			System.out.println(str + " a palindorme");
		} else {
			System.out.println(str + " not a palindrome");
		}

	}

}
