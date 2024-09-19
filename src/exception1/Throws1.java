package exception1;

import java.util.Scanner;
//not working
public class Throws1 {

	public static void main(String[] args) throws ArithmeticException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Code Start");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a / b;
		System.out.println(c);
		System.out.println("Code End");
	}

}
