package p6;

//protected (different package sub class)

import p5.A;

public class D extends A {
	public static void main(String[] args) {
		D d1 = new D();
		System.out.println(d1.x);
		d1.test();
	}
}
