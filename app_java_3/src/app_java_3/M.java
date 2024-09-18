package app_java_3;

//this keyword holds current object address that is running in the 
//program

public class M {
	public static void main(String[] args) {
		M m1 = new M();
		m1.test();
		
		M m2 = new M();
		m2.test();
		
		m1.test();
		m2.test();
	}
	public void test() {
		System.out.println(this);
	}
}
