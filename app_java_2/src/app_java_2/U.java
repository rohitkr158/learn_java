package app_java_2;

//static variable example with static void test

public class U {
	static int x = 48;
	public static void main(String[] args) {
		System.out.println(U.x);
		U.test();
	}
	public static void test() {
		System.out.println(x);
	}
}