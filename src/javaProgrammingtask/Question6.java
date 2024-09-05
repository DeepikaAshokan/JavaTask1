package javaProgrammingtask;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Which month");
		int month = sc.nextInt();
		System.out.println("rent of the room");
		float rent = sc.nextFloat();
		System.out.println("how many days");
		int days = sc.nextInt();
		float tariff;
		float calc, calc1;

		if (month <= 3) {
			tariff = rent * days;
			System.out.println("tariff: " + tariff);
		} else if (month >= 7 && month <= 10) {
			tariff = rent * days;
			System.out.println("tariff: " + tariff);
		} else {
			calc = rent * days;
			calc1 = calc * 20 / 100;
			tariff = calc + calc1;

			System.out.println("tariff: " + tariff);

		}

	}

}
