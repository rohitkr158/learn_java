package private_var_methods2;

//variables and methods (private)
//different package / non-subclass

import private_var_methods1.A;

public class E {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
		a1.test();
	}
}
