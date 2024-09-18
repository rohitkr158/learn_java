package public_construct_1;

//In public constructor objects can be created in same as well as in different package.
//In public constructor inheritance can be done in same as well as in different package.

//constructor (public)
//same class

public class A {
	public A() {
		System.out.println("form constructor");
	}
	public static void main(String[] args) {
		A a1 = new A();
	}
}
