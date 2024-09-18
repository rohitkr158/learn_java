package app_java_33_threads;


public class B {
	public static void main(String[] args) {
		A a1 = new A("xxx");
		a1.start();
		A a2 = new A("yyy");
		a2.start();
		A a3 = new A("zzz");
		a3.start();
	}
}
