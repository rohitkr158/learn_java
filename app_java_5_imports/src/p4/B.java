package p4;

import static p4.A.id;         		//importing static id from class A of same package

public class B {					
	public static void main(String[] args) {
		System.out.println(id);		//accessing id from class A of the same package
	}
}
