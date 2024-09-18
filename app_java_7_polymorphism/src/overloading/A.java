package overloading;

public class A {
	public int add (int x , int y) {
		return x + y ;
	}
	public double add (double x , double y) {
		return x + y ;
	}
	public static void main(String[] args) {
		A  a1 = new A();
		int val1 = a1.add(100, 220);
		System.out.println(val1);
		double val2 = a1.add(23.32, 44.44);
		System.out.println(val2);
	}
}
