package arithmeticException;

public class A {
	public static void main(String[] args) {
		try {
			int numerator = 20;
			int denominator = 0;

			int result = numerator / denominator; // this throws an arithmetic exception
			System.out.println("Result : " + result);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println(100);
	}
}
