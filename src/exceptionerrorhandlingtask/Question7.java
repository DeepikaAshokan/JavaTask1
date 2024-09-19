package exceptionerrorhandlingtask;

import java.util.ArrayList;

public class Question7 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("apple");
		al.add("Orange");
		al.add("banana");
		al.add("guava");
		al.add("fruits");
		System.out.println("ArrayList Inputs: " + al);

		String A[] = new String[al.size()];
		al.toArray(A);
		System.out.print("Array Inputs: ");
		for (String item : A) {
			System.out.print(item + ",");
		}

	}

}
