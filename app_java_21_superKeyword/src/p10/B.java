package p10;

//accessing parent class constructor with args using super keyword
//super keyword with parameter

public class B extends A {
	B(){
		super(500);
	}
	public static void main(String[] args) {
		new B();
	}
}
