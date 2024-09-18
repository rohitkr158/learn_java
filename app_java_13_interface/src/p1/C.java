package p1;

public class C implements B{
	public static void main(String[] args) {
		C c1 = new C();
		c1.addNumbers(10, 20);
		c1.addNumbers(120.43, 12.45);
	}

	@Override
	public void addNumbers(int x, int y) {
		System.out.println(x);
		System.out.println(y);
	}

	@Override
	public void addNumbers(double x, double y) {
		System.out.println(x);
		System.out.println(y);
	}
}
