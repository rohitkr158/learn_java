package A;

public class A implements B, C {

	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
	}
	public void test() {
		B.super.test();
		C.super.test();
	}

}
