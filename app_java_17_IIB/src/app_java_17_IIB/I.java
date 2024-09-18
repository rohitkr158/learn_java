package app_java_17_IIB;

public class I {
	static int x ;
	{
		x = 200;				//initializing static variable inside IIB
		System.out.println(x);
	}
	public static void main(String[] args) {
		I i1 = new I();
	}
}
