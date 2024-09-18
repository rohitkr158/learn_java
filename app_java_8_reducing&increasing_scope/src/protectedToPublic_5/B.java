package protectedToPublic_5;

//protected to public

public class B extends A {

	@Override
	public void test() {			//increased scope from protected to public
		System.out.println(567);
	}
	public static void main(String[] args) {
		B b1 = new B ();
		b1.test();
	}
}