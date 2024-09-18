package p3;

//default access specifier

public class F {
	int x = 23;			//instead of default don't write anything. 

	void test() {
		System.out.println("from test");
	}

	public static void main(String[] args) {
		F f1 = new F();
		System.out.println(f1.x);
		f1.test();
	}
}
