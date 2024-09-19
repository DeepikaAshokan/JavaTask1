package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

	//creating obj for arrayList as like Scanner- this is Arraylist declaration
		ArrayList mylist = new ArrayList();

		/* another ways is using parent "List" like {List mylist = new ArrayList();}
		 * child class obj can hold in parent variable */
		//If we are using only 1 datatype: ArrayList<Interger> mylist = new ArrayList<Integer>();

		mylist.add("Deepika");
		mylist.add(19);
		mylist.add(12.95);
		mylist.add(null);
		mylist.add(true);
		mylist.add('s');
		mylist.add("Deepika");

		System.out.println("Input : " + mylist);
		System.out.println("Size  : " +mylist.size());
		mylist.remove(5);
		mylist.add(2, "Hari");
		mylist.set(6, "Siana");
		System.out.println("The updated ArrayList is" +mylist);
		//Reading all elements in AL in 3 ways
		/*for(int i=0;i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		}*/
		/*for(Object a : mylist) {
			System.out.println(a);
		}*/
		Iterator it =mylist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//mylist.clear();
		System.out.println(mylist.isEmpty());

	}

}
