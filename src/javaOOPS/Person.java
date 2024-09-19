package javaOOPS;

public class Person {

	String name;
	int age;

	public void setValue(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void getValue() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

}
