package private_var_methods1;

//variables and package (private)
//subclass

public class B extends A{
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.x);
		b1.test();
	}
}
