package protected_construct_2;

//protected constructor creates object only in same class and subclass of same package
//protected constructor can be inherited anywhere but can not create objects in different package.

//constructor (protected)
//different package / non-subclass

import protected_construct_1.A;

public class E {
	public static void main(String[] args) {
		A a1 = new A();
	}
}
