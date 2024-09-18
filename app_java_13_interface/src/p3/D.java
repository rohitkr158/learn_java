package p3;


public class D implements C {

	@Override
	public void test1() {
		System.out.println(1);
	}

	@Override
	public void test2() {
		System.out.println(2);
	}

	@Override
	public void test3() {
		System.out.println(3);
	}
	public static void main(String[] args) {
		D d1 = new D();
		d1.test1();
		d1.test2();
		d1.test3();
	}

}
