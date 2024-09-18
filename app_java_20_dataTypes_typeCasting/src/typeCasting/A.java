package typeCasting;

//upCasting

public class A {
	int i = 19;
	long j = i;		//increased the memory form int to long
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.j);
	}
}

