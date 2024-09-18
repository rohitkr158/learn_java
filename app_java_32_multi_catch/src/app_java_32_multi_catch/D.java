package app_java_32_multi_catch;

public class D {
	public static void main(String[] args) {
		try {
			Integer.parseInt("hello");
		} catch (NullPointerException e) {
			System.out.println(1);
		} catch (ArithmeticException e) {
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(3);		//this exception will handled and 3 will be printed
		}
		System.out.println("welcome");
	}
}
