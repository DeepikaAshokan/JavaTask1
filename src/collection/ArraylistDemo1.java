package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistDemo1 {

	public static void main(String[] args) {

		ArrayList<String> array = new ArrayList<>();
		array.add("azx");
		array.add("ooo");
		array.add("lkj");
		array.add("Hum");
		System.out.println(array);
		Collections.sort(array);
		System.out.println(array);



	}

}
