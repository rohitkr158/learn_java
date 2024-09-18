package more_than_one_main_method;

public class A {
	public static void main(String[] args) {
		System.out.println(200);
		A.main();
	}

	public static void main() {  	//can make more than one method without argument
		System.out.println(43);
	}
}
