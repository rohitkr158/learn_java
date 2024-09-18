package app_java_2;

//static reference variable

public class Y {
	static int x = 48;				//global access
	static Y y1 = new Y();			//global access
	public static void main(String[] args) {
		System.out.println(x);		//correct
		System.out.println(y1);		//correct
		y1.test();
	}
	public void test() {
		System.out.println(x);		//correct
		System.out.println(y1);		//correct
	}
}
