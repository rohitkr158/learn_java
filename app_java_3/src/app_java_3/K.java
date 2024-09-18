package app_java_3;

//using this keyword to access constructor

public class K {
	K(int x){
		System.out.println(x);
	}
	K(){
		System.out.println(22);
	}
	public static void main(String[] args) {
		K k1 = new K();
		k1.test1();
	}
	public void test1() {
		this.test2();
	}
	public void test2() {
		K k2 = new K(123);
	}
}
