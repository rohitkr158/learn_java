package app_java_18_SIB;

public class D {
	D(){
		System.out.println("from constructor ");
	}
	static {
		System.out.println("from SIB 2");
	}
	static {
		System.out.println("from SIB 1");
	}
	public static void main(String[] args) {
		System.out.println("start main");
		D d1 = new D();
		System.out.println("end main");
	}
}
