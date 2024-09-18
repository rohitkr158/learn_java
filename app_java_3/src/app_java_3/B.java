package app_java_3;

public class B {
	void B(){    //method, non-static
		System.out.println(100); 	//no output b/c constructor is 
									//not being called
	}
	public static void main(String[] args) {
		B b1 = new B();
		//b1.B();   //constructor should be called by object's add.
					//b/c of method/void constructor
	}
}
