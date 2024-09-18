package app_java_3;

//constructor with arguments

public class D {
	D(int x){				//args = 1, type int
		System.out.println(x);
	}
	public static void main(String[] args) {
		D d1 = new D(234);	//args is passed & stored in x
	}
}
