package app_java_2;
 
//non-static and void method with return

public class A {
	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
	}
	public void test() {
		return 100;  //ERROR b/c void method cannot return any value.
	}
}