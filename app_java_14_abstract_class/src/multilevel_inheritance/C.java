package multilevel_inheritance;

public class C extends B {

	@Override
	public void test1() {
		System.out.println("from test 1");
	}
	public static void main(String[] args) {
		C c1 = new C();
		c1.test1();
		c1.test2();
	}

}
