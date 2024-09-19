package collection;

import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {

LinkedList<String> name = new LinkedList<>();

//queue - FIFO

name.add("abd");
name.add("ghu");
name.add("ooo");
name.add("hhh");
System.out.println(name);
name.remove();
System.out.println(name);
name.addFirst("sss");
System.out.println(name);
name.addLast("ppp");
System.out.println(name);
name.removeFirst();
System.out.println(name);
name.removeLast();
System.out.println(name);
	}

}
