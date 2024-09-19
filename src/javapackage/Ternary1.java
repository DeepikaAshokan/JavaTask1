package javapackage;

import java.util.Scanner;

public class Ternary1 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number");

float num = sc.nextFloat();

String result = (num>0) ? "POSITIVE" : "NEGATIVE";

System.out.println(result);

	}

}
