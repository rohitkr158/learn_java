package runTime;

public class ArithmeticException2 {
	public static void main(String[] args) {
		try {
			int numerator = 20;
			int denominator = 0;
			int result = numerator / denominator;
			System.out.println("Result" + result);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("welcome");
	}
}
