package p7;

//accessing parent class constructor without writing super()

public class B extends A{
	B(){
		// super(); automatically placed by compiler
		System.out.println("from B");
	}
	public static void main(String[] args) {
		new B();
	}
}
