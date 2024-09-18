package default_var_methods_2;

//variables and methods (default)
//different package / non-subclass

import default_var_methods_1.A;

public class E {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
		a1.test();
	}
}
