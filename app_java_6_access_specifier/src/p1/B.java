package p1;

//(private) same package subclass using inheritance
//private variable, private method

public class B extends A{		//extending class A 
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.x);  //error
		b1.test(); //error
	}
}

