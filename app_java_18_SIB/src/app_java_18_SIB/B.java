package app_java_18_SIB;

public class B {
	static {
		System.out.println("from SIB 1");
	}
	static {
		System.out.println("from SIB 2");
	}
	public static void main(String[] args) {
		B b1 = new B();
	}
}
