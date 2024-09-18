package p1;

public class D {
	public void test() {
		System.out.println("from test");
	}
	public static void main(String[] args) {
		new D().test();
	}
	{
		System.out.println("from IIB");
	}
	static {
		System.out.println("from SIB");
	}
	D(){
		System.out.println("from constructor");
	}
}
