package protectedToDefault_3;

//protected to default

public class B extends A{

	@Override
	void test() {			//ERROR b/c we reduced scope from protected to default 
		System.out.println(27);
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
	}
	
}
