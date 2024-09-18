package protected_construct_1;

//protected constructor creates object only in same class and subclass of same package
//protected constructor can be inherited anywhere but can not create objects in different package.

//constructor (protected)
//same class

public class A {
	protected A() {
		System.out.println("from constructor");
	}
	public static void main(String[] args) {
		A a1 = new A();
	}
}
