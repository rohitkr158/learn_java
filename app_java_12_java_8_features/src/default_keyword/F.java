package default_keyword;

public class F implements E {

	@Override
	public void test2() {
		System.out.println(2345678);
	}

	public static void main(String[] args) {
		F f1 = new F();
		f1.test1();
		f1.test2();
		f1.test3();
	}

}
