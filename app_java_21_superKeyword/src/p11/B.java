package p11;

//accessing parent class constructor without writing super()
//super keyword with args are not automatically generated

public class B extends A {
	B(){
		//super() automatically generated
		//but cannot call constructor with args
		System.out.println("from B");
	}
	public static void main(String[] args) {
		new B();
	} 
	
}
