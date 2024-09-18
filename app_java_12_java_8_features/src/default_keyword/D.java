package default_keyword;

public class D implements C {

	@Override
	public void test3() {
		System.out.println(76443);
	}

	public static void main(String[] args) {
		D d1 = new D();
		d1.test1();
		d1.test2();
		d1.test3();
	}
}
