package complete_incomplete_methods;

public class B extends A {

	@Override
	public void test1() {
		System.out.println(1);
	}

	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
		b1.test2();
	}

}
