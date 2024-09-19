package exceptionerrorhandlingtask;

import java.util.ArrayList;

public class Question5 {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();

		ar.add("Deepika");
		ar.add("Siana");
		ar.add("Hari");
		ar.add("Dhanya");
		ar.add("Mridhu");
		System.out.println("Actual Input : " + ar);
		ar.remove(3);
		System.out.println("After removal: " + ar);
		ar.clear();
		System.out.println("Elements available : " + ar.isEmpty());

	}

}
