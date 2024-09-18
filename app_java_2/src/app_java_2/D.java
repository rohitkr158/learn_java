package app_java_2;

//non-static and a void method with 3 test calling statement

public class D {
	public static void main(String[] args) {
		D d1 = new D();
		d1.test();
		d1.test();
		d1.test();
	}
	public void test() {
		System.out.println(1100);
	}
}
