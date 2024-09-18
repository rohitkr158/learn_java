package default_keyword;

//default keyword in Functional interface

@FunctionalInterface
public interface E {
	default public void test1() {
		System.out.println(22);
	}

	public void test2();

	default public void test3() {
		System.out.println(22);
	}

}
