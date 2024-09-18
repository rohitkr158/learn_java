package p5;

//protected (same package sub class)

public class B extends A{
	public static void main(String[] args) {
		B  b1 = new B();
		System.out.println(b1.x);
		b1.test();
	}
}
