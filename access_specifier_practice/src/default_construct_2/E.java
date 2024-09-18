package default_construct_2;

//In default constructor objects can be created in same class and in same package but not in different package.
//In default constructor inheritance can be done in same package but not in different package.

//constructor (default)
//different package /sub class

import default_construct_1.A;

public class E {
	public static void main(String[] args) {
		A a1 = new A();
	}
}
