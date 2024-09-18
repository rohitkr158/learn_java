package p12;

//accessing parent class constructor without writing super()
//super keyword with args are not automatically generated

public class A {
	A(){
		System.out.println("from A");
	}
	A(int x){
		System.out.println(x);
	}
}
