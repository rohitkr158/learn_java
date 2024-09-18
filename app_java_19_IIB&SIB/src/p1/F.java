package p1;

public class F {
	{
		System.out.println("from IIB");
	}
	static {
		new F();
		System.out.println("from SIB");
		new F();
	}
	public static void main(String[] args) {
		System.out.println("from main");
		F f1 = new F();
	}
	
}
