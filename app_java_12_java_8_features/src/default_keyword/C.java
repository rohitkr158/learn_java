package default_keyword;

//default keyword in interface

public interface C {
	default public void test1() {
		System.out.println(788);
	}
	default public void test2() {
		System.out.println(990);
	}
	public void test3();
}
