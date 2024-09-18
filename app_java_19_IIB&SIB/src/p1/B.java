package p1;

public class B {
	B(){
		System.out.println("from constructor");
	}
	{
		System.out.println("from IIB");
	}
	static {
		new B();
		System.out.println("from SIB");
	}
	public static void main(String[] args) {
		System.out.println("from main");
	}
}
