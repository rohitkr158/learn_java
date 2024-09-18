package public_construct_2;

//In public constructor object can be created in same package and in different package.
//In public constructor inheritance can be done in same package and in different package.

//constructor (public)
//different package / non - subclass

import public_construct_1.A;

public class E {
	public static void main(String[] args) {
		A a1 = new A();
	}
}
