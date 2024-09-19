package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistdemo {

	public static void main(String[] args) {

		ArrayList<Integer> arraylist = new ArrayList<>();

		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(15);
		arraylist.add(4);
		arraylist.add(55);
		arraylist.add(19);
		arraylist.add(01);
		System.out.println(arraylist);

		//SORTING

		Collections.sort(arraylist);
		System.out.println("Sorting: " +arraylist);

		int search = 15;

		if(arraylist.contains(search)) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}


	}

}
