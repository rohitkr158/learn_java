package p1;

// (private) same class 
//private variable, private method

public class A {
	private int x = 19;

	private void test() {
		System.out.println("from test");
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
		System.out.println(a1.x);
	}
}
