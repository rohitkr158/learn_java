package overriding1;

//override example

public class A {
	public void test1() {
		System.out.println(100);
	}

	public int test2() {		//return type method
		return 100;
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.test1();				//calling test1
		int x = a1.test2();		//calling test2 and storing value into x
		System.out.println(x);
	}
}
