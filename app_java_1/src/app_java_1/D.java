package app_java_1;

//non-static variable with more than one object

public class D {
	int x = 10;

	public static void main(String[] args) {
		D d1 = new D();
		D d2 = new D();
		System.out.println(d1.x);
		System.out.println(d2.x);
	}
}