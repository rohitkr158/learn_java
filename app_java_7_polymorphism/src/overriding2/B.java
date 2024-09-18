package overriding2;

public class B extends A {

	@Override
	public void test1() {
		System.out.println("from testing person");
	}

	@Override
	public String test2() {
		return "mike";
	}

	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
		String x = b1.test2();
		System.out.println(x);
	}
}
