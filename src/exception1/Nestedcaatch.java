package exception1;

public class Nestedcaatch {

	public static void main(String[] args) {
		try {
			System.out.println(15 / 0);
		} catch (ArithmeticException ae) {
			try {
				char h[] = { 'a', 'b', 'c', 'd' };
				System.out.println(h[6]);
			} catch (ArrayIndexOutOfBoundsException ai) {
				System.out.println("ARRAYEXP");
			}
			System.out.println("ArithmeticEXP");
		}

	}

}
