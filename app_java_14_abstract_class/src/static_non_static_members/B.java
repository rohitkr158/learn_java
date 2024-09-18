package static_non_static_members;


public class B extends A {
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.x);	//calling by object's address
		System.out.println(A.y);	//calling static member by abstract class
	}
}


