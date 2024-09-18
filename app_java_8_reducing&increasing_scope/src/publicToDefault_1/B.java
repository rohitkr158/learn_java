package publicToDefault_1;

//reducing scope of access specifier
//public to default

public class B extends A{		//inheritance to override
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
	}

	@Override
	void test() {			//ERROR b/c we made public to default
		System.out.println(100);
	}
}
