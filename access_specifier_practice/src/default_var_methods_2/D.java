package default_var_methods_2;

//variables and methods (default)
//different package / subclass

import default_var_methods_1.A;

public class D extends A{
	public static void main(String[] args) {
		D d1 = new D();
		System.out.println(d1.x);
		d1.test();
	}
}
