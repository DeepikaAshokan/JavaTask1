package collection;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(101, "Ashokan");
		hm.put(102, "Shanthi");
		hm.put(103, "Dhanya");
		hm.put(104, "Deepika");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.remove(103));
		System.out.println(hm.get(104));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		for (int k : hm.keySet()) {
			System.out.println(hm.get(k));
		}

	}

}
