package p2;

import static p2.C.id;

public class D {
	public static int x;		//will access in class E
	public static int y;		//will access in class E
	
	public static void main(String[] args) {
		System.out.println(id);
	}
}
