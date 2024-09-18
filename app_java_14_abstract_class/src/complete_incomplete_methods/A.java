package complete_incomplete_methods;

//An abstract class consists of booth complete and incomplete method

public abstract class A {
	abstract public void test1();		//incomplete method 
	
	public void test2() {				//complete method
		System.out.println(23);
	}
}
