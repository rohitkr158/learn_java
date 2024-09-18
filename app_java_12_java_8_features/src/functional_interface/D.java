package functional_interface;

@FunctionalInterface
public interface D {		//ERROR b/c there should be only one incomplete method
	public void test1();	//2 methods Error
	public void test2();
}
