package app_java_17_IIB;

public class J {
	static int x;
	int y;

	J() {
		System.out.println("from constructor");
	}

	{
		y = 20;
		System.out.println(y);
	}
	{
		x = 10;
		System.out.println(x);
	}

	public static void main(String[] args) {
		J j1 = new J();
	}
}
