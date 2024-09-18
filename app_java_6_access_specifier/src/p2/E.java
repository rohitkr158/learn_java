package p2;

//private (different package different non - subclass)

import p1.A;

public class E {		//not inheriting from p1 class A
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);	//error
		a1.test();					//error
	}
}
