package p8;

//public (different package non sub class)

import p7.A;

public class E {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
		a1.test();
	}
}
