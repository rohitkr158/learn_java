package p8;

//accessing parent class constructor without writing super()

public class B extends A{
	B(int x){
		//super() is automatically placed	
		System.out.println("from B");
	}
	
	public static void main(String[] args) {
		new B(100);
	}
}
