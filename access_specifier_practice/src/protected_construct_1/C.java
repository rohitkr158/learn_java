package protected_construct_1;

//protected constructor creates object only in same class and subclass of same package
//protected constructor can be inherited anywhere but can not create objects in different package.

//constructor (protected)
//non - subclass

public class C {
	public static void main(String[] args) {
		A a1 = new A();
	}
}
