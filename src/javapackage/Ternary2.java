package javapackage;

import java.util.Scanner;

public class Ternary2 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter the mark");

int mark = sc.nextInt();

String result = (mark>40) ? "PASS" : "FAIL";

System.out.println(result);
	}

}
