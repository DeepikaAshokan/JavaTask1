import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
	//	char ch = null;
	//	String a[] = { "deepika", "siana", "hari" };
		String s = null;

		try {
			int div = a / b;

			System.out.println("division of 2 numbers are: " + div);
			System.out.println(s.length());
			//System.out.println(a[3]);
			System.out.println(s.charAt(5));
		}

		catch (ArithmeticException ae) {
			System.out.println("Give values other than 0");
		}

		catch (NullPointerException ne) {

			System.out.println("Enter a valid number");
		}

		catch (ArrayIndexOutOfBoundsException ab) {

			System.out.println("enter the Array numbers");
		}

		catch (StringIndexOutOfBoundsException sb) {

			System.out.println("enter only numbers not strings");
		}

		catch (Exception e) {

			e.printStackTrace();
		}

	}

}
