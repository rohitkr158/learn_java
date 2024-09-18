package p5;
	
//protected (same class)

public class A {
	protected int x = 30;
	protected void test() {
		System.out.println("from test");
	}
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
		a1.test();
	}
}
