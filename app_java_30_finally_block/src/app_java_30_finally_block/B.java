package app_java_30_finally_block;

public class B {
	public static void main(String[] args) {
		try {
			int x = 100/0;
		} finally {
			System.out.println(1000);
		}
		System.out.println("hello");  		//hello will not print b/c catch block is not there and exception will not be handled.
	}
}
