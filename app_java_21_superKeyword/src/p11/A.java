package p11;

//accessing parent class constructor without writing super()
//super keyword with args are not automatically generated

public class A {
	A(int x){
		System.out.println(x);
	}
	A(){
		System.out.println("From A");
	}
}
