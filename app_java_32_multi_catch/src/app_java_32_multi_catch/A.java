package app_java_32_multi_catch;

public class A {
	public static void main(String[] args) {
		try {
			int x = 10 / 0;
		} catch (NullPointerException e) {	//always write child class first
			System.out.println(1);
		} catch (ArithmeticException e) {
			System.out.println(2);			// this block will handle the exception and prints 2
		} catch (Exception e) {
			System.out.println(3);
		}
		System.out.println("Welcome");
	}
}
