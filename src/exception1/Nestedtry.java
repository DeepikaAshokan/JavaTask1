package exception1;

public class Nestedtry {

	public static void main(String[] args) {

		try {
			try {
				int a[] = { 1, 2, 3, 4, 5, 6 };
				System.out.println(a[10]);
			} catch (ArrayIndexOutOfBoundsException ai) {
				System.out.println("ArrayEXP");
			}
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException np) {
			System.out.println("NullEXP");
		}
	}

}
