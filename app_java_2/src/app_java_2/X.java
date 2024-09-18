package app_java_2;

//reference variable example

public class X {
	public static void main(String[] args) {
		int hello = 20;					//local variable
		X x1 = new X();					//local reference variable
		System.out.println(hello);		//20
		System.out.println(x1);			//object's address
	}
	public void test() {
//		System.out.println(hello);	//error b/c used in another method
//		System.out.println(x1);		//error b/c used in another method
	}
}
