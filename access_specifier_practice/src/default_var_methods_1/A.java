package default_var_methods_1;

//variables and methods (default)
//same class

public class A {
	int x = 20;
	void test() {
		System.out.println("from test");
	}
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
		a1.test();
	}
}
