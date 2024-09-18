package A;

public interface B {
	default void test() {
		System.out.println("from B");
	}
}
