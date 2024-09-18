package app_java_1;

///static method

public class G {
	static int x = 23;

	public static void main(String[] args) {
		G.test();
	}

	public static void test() {
		System.out.println(x);
	}
}