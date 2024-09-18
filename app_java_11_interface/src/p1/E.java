package p1;

//implementing interface D in E

public class E implements D {

	@Override
	public void test1() {
		System.out.println("mike");
	}

	@Override
	public void test2() {
		System.out.println(33333);
	}
	public static void main(String[] args) {
		E e1 = new E();
		e1.test1();
		e1.test2();
	}
}
