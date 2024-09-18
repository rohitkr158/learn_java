package app_java_18_SIB;

//non static variables can not be initialized in SIB

public class F {
	int x;
	static {
		x = 29;			//non-static cannot be initialized in SIB
		System.out.println();
	}
	public static void main(String[] args) {
		
	}
}
