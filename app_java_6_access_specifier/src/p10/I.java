package p10;

//Access specifier on a class
//public (different package sub class)

import p9.F;

public class I extends F {
	public static void main(String[] args) {
		I i1 = new I();
		System.out.println(i1);
	}
}


//public (different non-sub class) is in p10 class J.