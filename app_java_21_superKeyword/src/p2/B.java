package p2;

//accessing non static method using super keyword

public class B extends A{
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
	}
	public void test() {
		super.xyz();
	}
}
