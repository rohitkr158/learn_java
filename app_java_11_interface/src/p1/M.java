package p1;

//multilevel inheritance in interface

public class M implements L {

	@Override
	public void test1() {
		System.out.println(23);
	}

	@Override
	public void test2() {
		System.out.println(980);
	}
	public static void main(String[] args) {
		M m1 = new M();
		m1.test1();
		m1.test2();
	}
	
}
