package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {

		HashSet myset = new HashSet();

		myset.add(500);
		myset.add("Deepika");
		myset.add('D');
		myset.add(null);
		myset.add(null);
		myset.add("Deepika");

		System.out.println(myset);
		System.out.println("Size of HashSet: " + myset.size());
		myset.remove(500);
		System.out.println(myset);

		ArrayList mylist = new ArrayList(myset);
		System.out.println(mylist);

		Iterator it = myset.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

		// myset.clear();

		System.out.println("set size: "+myset.isEmpty());

	}

}
