package private_var_methods2;

//variables and methods (private)
//different package / subclass

import private_var_methods1.A;

public class D extends A{
	public static void main(String[] args) {
		D d1 = new D();
		System.out.println(d1.x);
		d1.test();
	}
}
