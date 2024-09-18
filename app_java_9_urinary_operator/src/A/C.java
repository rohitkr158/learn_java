package A;

public interface C {
	default void test() {
		System.out.println("from c");
	}
}
