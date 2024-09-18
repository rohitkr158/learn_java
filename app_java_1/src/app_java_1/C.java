package app_java_1;

//non-static variable with object

public class C {
	int x = 10;

	public static void main(String[] args) {
		C c1 = new C();
		System.out.println(c1.x);   // always access object address
	}
}
//program runs b/c object is created