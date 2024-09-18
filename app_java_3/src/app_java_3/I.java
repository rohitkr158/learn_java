package app_java_3;

//multiple test calls using this keyword

public class I {
	public static void main(String[] args) {
		I i1 = new I();
		i1.test1();   	//calling test1
	}
	public void test1() {
		this.test2();	//calling test2
	}
	public void test2() {
		System.out.println(100);
	}
}
