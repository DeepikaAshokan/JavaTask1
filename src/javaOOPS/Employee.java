package javaOOPS;

import java.util.Scanner;

public class Employee {

	Scanner sc = new Scanner(System.in);
	int ID = sc.nextInt();
	String Firstname = sc.next();
	String Lastname = sc.next();
	int Salary = sc.nextInt();

	String Name = Firstname + Lastname;

	int Annualsalary;
	int Raisesalary;
	int Updatedsalary;

	public void AnnualSalary() {
		Annualsalary = Salary * 12;
		System.out.println("The Annual Salary will be:" + Annualsalary);
	}

	void Raisesalary(int i) {
		Raisesalary = Annualsalary * i / 100;
		Updatedsalary = Annualsalary + Raisesalary;
		System.out.println("The Updated Salary will be: " + Updatedsalary);

	}

	void write() {
		System.out.println("ID:" + ID + " Name:" + Name + " Salary: " + Updatedsalary);
	}

	public static void main(String[] args) {

		Employee obj = new Employee();

		obj.AnnualSalary();
		obj.Raisesalary(20);
		obj.write();

	}

}
