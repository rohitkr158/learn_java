package app_java_3;

//this can be used in accessing non-static member

public class H {
	int x = 40; //non-static 
	public static void main(String[] args) {
		H h1 = new H();
		System.out.println(h1.x);
		h1.test();
	}
	public void test() {
		System.out.println(this.x); //same output as a1.x
	}
	
}
