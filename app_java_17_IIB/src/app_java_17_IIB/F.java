package app_java_17_IIB;

public class F {
	{
		System.out.println("from IIB");
	}
	F(){
		System.out.println("from constuctor");
	}
	public static void main(String[] args) {
		System.out.println("start main");
		F f1 = new F();
		System.out.println("end main");
	}
}
