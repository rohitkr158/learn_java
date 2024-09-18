package p6;

//protected (different package non subclass)

import p5.A;

public class E {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);		//error
		a1.test();		//error
	}
}
