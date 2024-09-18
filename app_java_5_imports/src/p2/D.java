package p2;

//creating object of different class in same package.
// example of non-subclasses

public class D {
	public static void main(String[] args) {
		C c1 = new C();   	//creating object of class C in same package 
		System.out.println(c1);
	}
}
