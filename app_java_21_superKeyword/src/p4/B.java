package p4;

//accessing static variable in static method using super keyword

public class B {
	public static void main(String[] args) {
		B b1 = new B();
		B.test();
	}

	private static void test() {
		System.out.println(super.i); //cannot use super keyword in static method
	}
}
