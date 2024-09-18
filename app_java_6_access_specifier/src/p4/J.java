package p4;

//default (different package non-subclass)

import p3.F;

public class J {
	public static void main(String[] args) {
		F f1 = new F();
		System.out.println(f1.x);
		f1.test();
	}
}
