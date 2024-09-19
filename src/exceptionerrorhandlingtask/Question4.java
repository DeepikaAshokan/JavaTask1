package exceptionerrorhandlingtask;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Question4 {

	public static void main(String[] args) {
		try {
			read();
		} catch (FileNotFoundException e) {
			System.out.println("This file does not exist here!!!");
		}
	}

	public static void read() throws FileNotFoundException {
		FileReader fr = new FileReader("data.txt");
	}

}
