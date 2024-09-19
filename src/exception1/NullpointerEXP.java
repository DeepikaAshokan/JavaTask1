package exception1;

public class NullpointerEXP {

	public static void main(String[] args) {

		String a = null;
		try {
			System.out.println(a.length());
		} catch (NullPointerException ne) {
			System.out.println("Null Pointer Exception");
		}
		finally {
			System.out.println("Finallyblock: It will always get executed");
		}
	}

}
