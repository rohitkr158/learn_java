package protected_var_methods2;

//variables and methods (protected)
//different package / subclass

import protected_var_methods1.A;

public class D extends A {
	public static void main(String[] args) {
		D d1 = new D();
		System.out.println(d1.x);
		d1.test();
	}
}
