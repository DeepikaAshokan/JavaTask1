package collection;

import java.util.ArrayDeque;

public class Arraydequedemo {

	public static void main(String[] args) {

		ArrayDeque<String> name = new ArrayDeque<>();
		name.push("Hari");
		name.push("has");
		name.push("love");
		name.push("color");
		System.out.println(name);
		name.poll();
		System.out.println(name);

	}

}
