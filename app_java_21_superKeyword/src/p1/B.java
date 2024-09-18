package p1;

//accessing non static variable using super keyword

public class B extends A{
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
	}
	public void test() {
		System.out.println(super.i);
	}
}
