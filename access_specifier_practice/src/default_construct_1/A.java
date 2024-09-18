package default_construct_1;

//In default constructor objects can be created in same class and in same package but not in different package.
//In default constructor inheritance can be done in same package but not in different package.

//constructor (default)
//same class

public class A {
	A(){
		System.out.println("from constructor");
	}
	public static void main(String[] args) {
		A a1 = new A();
	}
}
