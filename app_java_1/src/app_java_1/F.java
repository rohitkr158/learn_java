package app_java_1;

//non-static method

public class F {
	int x = 45;
	public static void main(String[] args) {
		F f1 = new F();
		f1.test();
	}
	public void test() {
		System.out.println(x);
	} 
}
