package app_java_3;

//calling constructor with this keyword

public class N {
	N(){
		System.out.println(12);
	}
	N(int x){
		this();
		System.out.println(x);
	}
	public static void main(String[] args) {
		N n1 = new N(222);
	}
}
