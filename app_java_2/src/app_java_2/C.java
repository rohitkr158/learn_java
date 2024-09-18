package app_java_2;

//non-static and not a void method with string with return

public class C {
	public static void main(String[] args) {
		C c1 = new C();
		String x = c1.test();
		System.out.println(x);
	}

	public String test() {
		return "mike";
	}
}