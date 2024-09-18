package app_java_3;

//this can access static member but not to be performed

public class L {
	static int x = 500;
	public static void main(String[] args) {
		L l1 = new L();
		l1.test();
	}
	public void test() {
		System.out.println(this.x); //should use L.x
									//this.x should not be performed
	}
}
