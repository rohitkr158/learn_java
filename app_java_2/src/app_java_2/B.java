package app_java_2;

//non-static and not a void method with integer with return

public class B {
	public static void main(String[] args) {
		B b1 = new B();
		int x = b1.test();
		System.out.println(x);
	}
	public int test() {
		return 100;
	}
}
