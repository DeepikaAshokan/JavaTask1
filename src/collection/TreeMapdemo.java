package collection;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapdemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> mymap = new TreeMap<>();

		mymap.put(101, "goo");
		mymap.put(50, "com");
		mymap.put(103, "hai");
		mymap.put(99, "run");
		mymap.put(104, "hai");
		mymap.put(101,"bye");
		System.out.println(mymap);
		///printing with key ascending order
		mymap.remove(50);
		System.out.println(mymap);

		LinkedHashMap<Integer,String> hashmap = new LinkedHashMap<>();
		hashmap.put(101, "go");
		hashmap.put(50, "com");
		hashmap.put(103, "hai");
		hashmap.put(99, "run");
		hashmap.put(104, "hai");
		hashmap.put(101,"bye");
		System.out.println(hashmap);
		hashmap.remove(104);
		System.out.println(hashmap);


	}

}
