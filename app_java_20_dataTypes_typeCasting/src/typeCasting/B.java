package typeCasting;

//upCasting

public class B {
	byte i = 10;
	short j = i;
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.j);
	}
}
