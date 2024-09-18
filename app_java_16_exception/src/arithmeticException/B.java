package arithmeticException;

public class B {
	public static void main(String[] args) {
		try {
			int numerator = 10;
			int denominator = 0;
			int result = numerator % denominator;
			System.out.println("Result : " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(23);
	}
}
