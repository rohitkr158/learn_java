package runTime;

public class ArithmeticException3 {
	public static void main(String[] args) {
		try {
			int numerator = 30;
			int denominator = 0;
			int result = numerator % denominator;
			System.out.println("Result" + result);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("welcome");
	}
}
