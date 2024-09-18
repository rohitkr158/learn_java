package app_java_3;

public class C {
	void C(){
		System.out.println(190);
	}
	public static void main(String[] args) {
		C c1 = new C();
		c1.C();    //output 190 b/c constructor is being called with
					//object address.
	}
}
