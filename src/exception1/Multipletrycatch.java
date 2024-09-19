package exception1;

public class Multipletrycatch {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		String str = null;
		int s[] = { 1, 5, 10, 4, 45, 2 };
		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic");
		}
		try {
			System.out.println(str.length());
		} catch (NullPointerException ne) {
			System.out.println("Null");
			try {
				System.out.println(s[10]);
			} catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println("Array");
			}
		} catch (Exception e) {
			System.out.println("Parent of all Exceptions");
		}
	}

}
