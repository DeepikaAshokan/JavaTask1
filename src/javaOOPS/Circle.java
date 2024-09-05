package javaOOPS;

import java.util.Scanner;

public class Circle {

	Scanner sc = new Scanner(System.in);
	int radius = sc.nextInt();
	String color;
	int num;
	double circumferance;

	public void circle() {
		System.out.println("The circle has no sides");
		circumferance = 2 * 3.14 * radius;

	}

	public void circle(String color, int num) {

		this.color = color;
		this.num = num;

	}

	public void write() {
		System.out.println("The color of the circle is:" + color);
		System.out.println("The number of circles are: " + num);
		System.out.println("The circumferance of the circle is: " + circumferance);
	}

	public static void main(String[] args) {

		Circle obj = new Circle();
		obj.circle();
		obj.circle("Blue", 5);
		obj.write();
	}

}
