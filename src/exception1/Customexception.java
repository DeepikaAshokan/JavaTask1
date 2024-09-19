package exception1;

class DummyException extends Exception {

	DummyException(String msg) {

		System.out.println(msg);
	}
}

	public class Customexception {

		public static void main(String[] args) {

			try {
				drive(20);
			} catch (Exception e) {

				System.out.println("Age must be 18");
			}
		}

		public static void drive(int age) throws Exception {

			if (age < 18) {

				throw new DummyException("Not eligible for driving");
			} else {

				System.out.println("Eligible for driving");
			}

		}
	}
