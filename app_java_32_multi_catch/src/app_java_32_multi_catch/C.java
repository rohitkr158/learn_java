package app_java_32_multi_catch;

public class C {
	int x = 10;
	static C c1 = null;
	public static void main(String[] args) {

		try {
			System.out.println(c1.x);

		} catch (NullPointerException e) {
			System.out.println(1);				//nullPointerException will be handled
		} catch (ArithmeticException e) {
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(3);
		}
		System.out.println("welcome");
	}
}
