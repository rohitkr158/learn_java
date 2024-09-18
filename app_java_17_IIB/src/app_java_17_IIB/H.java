package app_java_17_IIB;

public class H {
	int x;
	{
		x = 10;					//initializing non-static variable inside IIB
		System.out.println(x);
	}
	public static void main(String[] args) {
		H h1 = new H();
	}
}
