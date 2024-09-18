package p13;

//accessing parent class constructor using this and super keyword both

public class B extends A {
	B(){
		//super() is automatically generated
		this();   //either of the keyword cannot be 2nd statement and super keyword cannot be placed b/c of this keyword
	}
	public static void main(String[] args) {
		new B();
	}
	
	
}
