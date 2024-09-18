package p2;

//(private) different package sub class
//inheriting class A from package p1 to class C package p2


	import p1.A;     //importing class A from p1
public class D extends A{       //inheriting class A
	public static void main(String[] args) {
		D d1 = new D();
		System.out.println(d1.x);
		d1.test();
	}
}
