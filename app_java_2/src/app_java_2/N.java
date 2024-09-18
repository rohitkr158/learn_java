package app_java_2;

//return value example with code error

public class N {
	public static void main(String[] args) {
		N n1 = new N();
		int x = n1.test();
		System.out.println(x);
	}
	public int test() {
		return 100;
		System.out.println(100);     //unreachable code error
	}
}
