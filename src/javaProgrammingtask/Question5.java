package javaProgrammingtask;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the mark");

		int m = sc.nextInt();
		
		switch (m/10){

		case 10:
			System.out.println("Your Grade is S");
			break;
		case 9:
			System.out.println("Your Grade is A");
			break;
		case 8:
			System.out.println("Your Grade is B");
			break;
		case 7:
			System.out.println("Your Grade is C");
			break;
		case 6:
			System.out.println("Your Grade is D");
			break;
		case 5:
			System.out.println("Your Grade is E");
			break;
		case 4:
			System.out.println("Your Grade is F");
			break;
		default:
			System.out.println("Invalid Input");
			break;

		}

	}

}