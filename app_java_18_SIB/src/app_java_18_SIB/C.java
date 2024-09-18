package app_java_18_SIB;

//always print SIB then constructor , then main

public class C {
	static {
		System.out.println("from SIB");
	}
	public static void main(String[] args) {
		System.out.println("from main");	//whether main is in 1st or 2nd position doesn't matter
		C c1 = new C();
	}
}
