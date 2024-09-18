package p1;

//main method can be created in interface
//static complete methods are allowed
//Non-static methods are not allowed b/c we cannot create object of interface

public interface A {
	static int x = 20;				//static variable
	public static void main(String[] args) {
		System.out.println(A.x);
		A.test();
	}
	public static void test() {   	//static method
		System.out.println(67);
	}
}
