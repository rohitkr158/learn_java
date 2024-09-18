package p1;

//inheriting static method class H in I 

public class I extends H {
	public static void main(String[] args) {
		I.test();
		System.out.println(I.x);
	}
}
