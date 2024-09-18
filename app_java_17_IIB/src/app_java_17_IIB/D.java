package app_java_17_IIB;

//IIB runs first then constructor

public class D {
	D() {
		System.out.println("from constructor");	//this execute at second
	}

	{
		System.out.println("from IIB");	//this will execute first
	}

	public static void main(String[] args) {
		D d1 = new D();
	}
}
