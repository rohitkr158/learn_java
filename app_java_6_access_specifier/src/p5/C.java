package p5;

//protected (same package non-subclass)

public class C {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
		a1.test();
	}
}
