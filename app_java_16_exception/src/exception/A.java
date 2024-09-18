package exception;

public class A {
	public static void main(String[] args) {
		int x = 20;
		int y = 0;
		int z = x / y; // exception. Program stops here only
		System.out.println(z);
		System.out.println("main");
	}
}
