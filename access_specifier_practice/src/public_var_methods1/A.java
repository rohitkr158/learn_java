package public_var_methods1;

//variables and methods (public)
//same class

public class A {
	public int x = 50;
	public void test() {
		System.out.println("from test");
	}
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
		a1.test();
	}
}
