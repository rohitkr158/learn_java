package app_java_2;

//local variable example

public class Q {
	public static void main(String[] args) {
		Q q1 = new Q();
		q1.test();
//		System.out.println(x);  //error b/c LV not used in same method
	}
	public void test() {
		int x = 34;
		System.out.println(x);			//20
	}
}
