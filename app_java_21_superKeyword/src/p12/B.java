package p12;

//accessing parent class constructor without writing super()
//super keyword with args are not automatically generated

public class B extends A {
	B() {
//		super() automatically generated
		System.out.println("From B");
	}

	B(int y) {
		// super() automatically generated
		System.out.println(y);
	}

	public static void main(String[] args) {
		new B();
		new B(299);
	}

}
