package p2;


public class C implements A, B {

	@Override
	public void test1() {
		System.out.println(12);
	}

	@Override
	public void test2() {
		System.out.println(98);
	}
	public static void main(String[] args) {
		C c1 = new C();
		c1.test1();
		c1.test2();
	}
}
