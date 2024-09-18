package app_java_2;

//local variable example

public class O {
	public static void main(String[] args) {
		int x = 33;					//local variable created
		System.out.println(x);		//using in same method
		O o1 = new O();
		o1.test();
	}
	public void test() {
//		System.out.println(x);      //error b/c local variable
									//is using in another method
	}
}
