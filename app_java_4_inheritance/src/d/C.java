package d;

public class C extends B {
	public void test3() {
		System.out.println("from test3");
	}

	public static void main(String[] args) {
		C c = new C();
		c.test1();
		c.test2();
		c.test3();
	}

}
