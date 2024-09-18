package app_java_3;

//constructor overloading

public class F {
	F(){
		System.out.println(123);
	}
	F(int x){
		System.out.println(x);
	}
	F(String x , double y){
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		F f1 = new F();
		F f2 = new F(65555);
		F f3 = new F("test", 12.32);
	}
}
