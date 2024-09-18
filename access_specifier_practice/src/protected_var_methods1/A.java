package protected_var_methods1;

//variables and methods (protected)
//same class

public class A {
	protected int x = 40;
	protected void test() {
		System.out.println("from test");
	}
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
		a1.test();
	}
}
