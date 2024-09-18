package public_construct_2;

//In public constructor objects can be created in same as well as in different package.
//In public constructor inheritance can be done in same as well as in different package.

//constructor (public)
//different package / subclass

import public_construct_1.A;

public class D extends A{
	public static void main(String[] args) {
		A a1 = new A();
	}
}
