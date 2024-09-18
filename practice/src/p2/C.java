package p2;

public class C {
	public static int id = 34;  //will access in class D
	public static void main(String[] args) {
		p2.A a1 = new p2.A();	//importing class A object in class C
		B b1 = new B();			//creating class B object in class C of same package
	}
}
