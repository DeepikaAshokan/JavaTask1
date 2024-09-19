package exception1;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {

		System.out.println("Enter 2 numbers:");

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		String ch = null;
		String at[] = { "deepika", "siana", "hari" };
		String s = "Hareram";

		try {
			int div = a / b;
			System.out.println(div);
			System.out.println(ch.length());
			System.out.println(at[2]);
			System.out.println(s.charAt(5));
		}

		catch (ArithmeticException ae) {
			System.out.println("Give values other than 0 - ARitHMETIC");
		}

		catch (NullPointerException ne) {

			System.out.println("NULL exp");
		}

		catch (ArrayIndexOutOfBoundsException ab) {

			System.out.println("Array EXP");
		}

		catch (StringIndexOutOfBoundsException sb) {

			System.out.println("Strings EXP");
		}

		catch (Exception e) {

			e.printStackTrace();
		}

	}

}
