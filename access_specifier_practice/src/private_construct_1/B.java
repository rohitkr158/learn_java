package private_construct_1;

//constructor can never be inherited.

//constructor (private)
//subclass

public class B extends A {		//private constructor can be only in same class
	public static void main(String[] args) {
		A a1 = new A();
	}
}
