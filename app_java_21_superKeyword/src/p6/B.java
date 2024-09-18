package p6;

//using super keyword as 2nd statement

public class B extends A {
	B(){
		System.out.println("from B");
		super();		//2nd statement
	}
	public static void main(String[] args) {
		B b1 = new B();
	}
}
