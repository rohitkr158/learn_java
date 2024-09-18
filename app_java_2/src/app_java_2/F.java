package app_java_2;

//static and void method with arguments

public class F {
	public static void main(String[] args) {
		F.test(12,"mike",34.76);
	}
	
	public static void test(int x , String y, double z) {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
