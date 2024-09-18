package p8;

//public (different package same class)

import p7.A;

public class D extends A {
	public static void main(String[] args) {
		D d1 = new D();
		System.out.println(d1.x);
		d1.test();
	}
}
