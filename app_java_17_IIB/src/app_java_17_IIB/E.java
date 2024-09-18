package app_java_17_IIB;

//IIB runs first, then constructor at second , then main method at third

public class E {
	E(){
		System.out.println("from constructor");
	}
	{
		System.out.println("from IIB");
	}
	public static void main(String[] args) {
		E e1 = new E();
		System.out.println("from main");
	}
}
