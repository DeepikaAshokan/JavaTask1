package exceptionerrorhandlingtask;

import java.util.Collections;
import java.util.TreeMap;

public class Question6 {

	public static void main(String[] args) {

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

		tm.put("Deepika", 123);
		tm.put("Siana", 789);
		tm.put("Hari", 456);
		tm.put("Dhanya", 159);
		tm.put("Ashokan", 753);
		System.out.println("Printing the elements in alphabetical order:" + tm);
	}
}