package exception1;

public class StringoutofBoundExp {

	public static void main(String[] args) {
		String str = "Deepika Mommy";

		try {
			System.out.println(str.charAt(15));
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("***String Out Bound***");

		}
		System.out.println(str.length());

	}
}
