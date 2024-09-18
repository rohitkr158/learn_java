package functional_interface;

public class C implements B {

	@Override
	public void test() {
		System.out.println(45);
	}
	public static void main(String[] args) {
		C c1 = new C();
		c1.test();
	}
}
