package static_members;

// only static members are allowed in abstract class.

public abstract class A {
	static int x = 80; // static members are allowed

	public static void test() {
		System.out.println("e");
	}

	public static void main(String[] args) {
		System.out.println(A.x);
		A.test();
	}
}
