package p11;

//Access specifier on constructor
// 1. private constructor (same class)

public class A {
	private A(){
		System.out.println("from constructor");
	}
	public static void main(String[] args) {
		A a1 = new A();
	}
}
