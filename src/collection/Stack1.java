package collection;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {

   Stack<String> name = new Stack<>();

   //LIFO last in first out

   name.push("Deepika");
   name.push("Siana");
   name.push("Hari");
   name.push("baby");
   System.out.println(name);
   name.pop();
   System.out.println(name);
	}

}
