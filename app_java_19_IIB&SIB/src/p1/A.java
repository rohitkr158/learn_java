package p1;

//IIB , SIB , constructor, main

public class A {
	{
		System.out.println("from IIB");
	}
	static {
		System.out.println("from SIB");
	}
	A(){
		System.out.println("from constructor");
	}
	public static void main(String[] args) {
		System.out.println("from main");
		A a1 = new A();
		System.out.println("end main");
	}
}
