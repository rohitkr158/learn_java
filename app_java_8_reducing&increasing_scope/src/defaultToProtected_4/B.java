package defaultToProtected_4;

public class B extends A{

	@Override
	protected void test() {
		System.out.println(245);
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
	}
	
}
