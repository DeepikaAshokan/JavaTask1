package exception1;

public class ArithmeticExp {

	public static void main(String[] args) {

		System.out.println("Start of code");
		try {
			int a = 50;
			int b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			// System.out.println("**Arithmetic Exception**");
			ae.printStackTrace();
		}

		System.out.println("End of code");
	}

}
