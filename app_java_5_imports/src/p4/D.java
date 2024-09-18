package p4;

import static p4.C.x; 		//importing static variable from class C of same package
import static p4.C.y;		//importing static variable from class C of same package

//import static p4.C.*;		//this method can also be done for importing in a single line

public class D {
	public static void main(String[] args) {
		System.out.println(x);	//accessing static variable of class C of same package
		System.out.println(y);	//accessing static variable of class C of same package
	}
}
