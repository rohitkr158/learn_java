package app_java_3;

public class O {
	O(int x){
		System.out.println(x);
	}
	O(){
		this(332);
	}
	public static void main(String[] args) {
		O o1 = new O();
	}
}
