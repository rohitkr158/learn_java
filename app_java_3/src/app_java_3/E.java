package app_java_3;

//constructor overloading

public class E {
	E(){  		//args = 0
		System.out.println(2);
	}
	E(int x){  	//args = 1 , type = int
		System.out.println(x);
	}
	E(String x){//args = 1 , type = String
		System.out.println(x);
	}
	public static void main(String[] args) {
		E e1 = new E();
		E e2 = new E(100);
		E e3 = new E("mike");
	}
}
