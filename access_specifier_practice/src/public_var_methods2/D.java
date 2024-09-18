package public_var_methods2;

//variables and methods (public)
//different package / subclass

import public_var_methods1.A;

public class D extends A {
	public static void main(String[] args) {
		D d1 = new D();
		System.out.println(d1.x);
		d1.test();
	}
}
