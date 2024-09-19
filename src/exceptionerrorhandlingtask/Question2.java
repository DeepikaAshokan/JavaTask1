package exceptionerrorhandlingtask;

public class Question2 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		String str = "Exception Handling Task";

		try {
			System.out.println(a[10]);
		} catch (ArrayIndexOutOfBoundsException ai) {

			System.out.println("***Array Out Of Bounds***");
		}
		try {
			System.out.println(str.charAt(25));

		} catch (StringIndexOutOfBoundsException si) {
			System.out.println("***String Out Of Bounds***");
		}
	}

}
