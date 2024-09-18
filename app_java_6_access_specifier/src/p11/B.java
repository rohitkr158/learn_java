package p11;

//Access specifier on constructor
//1. private constructor (different class)

public class B {
	A a1 = new A();     //Error b/c we cannot create object of a private constructor same package or in different package.
}
