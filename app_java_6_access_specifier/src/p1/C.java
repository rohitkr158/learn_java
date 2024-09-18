package p1;

//(private) same package non- sub class
//private variable , private method

public class C {         //accessing class A in class C
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);   //error
		a1.test();    //error
	}
	
}
