package overriding1;

public class B extends A {

	@Override
	public void test1() {
		System.out.println(300); // override from test1() (class A)
	}

	@Override
	public int test2() {
		return 500; // override from test2() (class A)
	}

	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
		int val = b1.test2();
		System.out.println(val);
	}
}
