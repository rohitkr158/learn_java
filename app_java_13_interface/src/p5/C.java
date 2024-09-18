package p5;


@FunctionalInterface
public interface C extends A, B {   	//ERROR b/c of more than 1 abstract method 
										//b/c here inheriting 2 methods and in interface C there is another abstract methods
										//total 3 methods, and functional interface can have only one method
	public void test3();
}
