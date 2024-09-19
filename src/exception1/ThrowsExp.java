package exception1;

public class ThrowsExp {

	public static void main(String[] args) throws InterruptedException  {

		for (int i = 0; i <= 9; i++) {
			System.out.println(i);
			//to slow down the input for 1 sec - compile time exp- checked exp
				Thread.sleep(1000);

		}
	}

}
