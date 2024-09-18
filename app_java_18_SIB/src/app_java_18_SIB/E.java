package app_java_18_SIB;

public class E {
	static int x;
	
	static {
		x = 20;
		System.out.println(x);
	}
	public static void main(String[] args) {
//		E e1 = new E(); 	//SIB doesn't need object to be created
		System.out.println("from main");
	}
}
