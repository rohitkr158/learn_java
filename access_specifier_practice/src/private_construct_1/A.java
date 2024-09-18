package private_construct_1;

//private constructor can never be inherited and can creates objects in same class.

//constructor (private)
//same class

public class A {
	private A() {
		System.out.println("from constructor");
	}
	public static void main(String[] args) {
		A a1 = new A();
	}
}
