package p1;

public class C {
	static {
		System.out.println("from SIB 1");
	}
	static {
		System.out.println("from SIB 2");
		new C();
	}
	{
		System.out.println("from IIB");
	}
	C(){
		System.out.println("from constructor");
	}
	public static void main(String[] args) {
		new C();
	}
}
