package app_java_2;

//static variable example with non-static void test calling

public class T {
	static int x = 20;
	public static void main(String[] args) {
		System.out.println(T.x);
		T t1 = new T();
		t1.test();
	}
	public void test() {
		System.out.println(x);
	}
}
