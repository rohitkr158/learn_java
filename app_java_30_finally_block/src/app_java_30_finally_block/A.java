package app_java_30_finally_block;

public class A {
	public static void main(String[] args) {
		try {
			int x = 10/0;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("mike");		//it will definitely print
		}
		System.out.println("hello");
	}
	
}
