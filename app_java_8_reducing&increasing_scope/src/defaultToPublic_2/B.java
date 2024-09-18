package defaultToPublic_2;

//increasing scope of access specifier
//default to public

public class B extends A{

	@Override
	public void test() {				//no ERROR b/c we increased the scope from default to public		System.out.println(600);		//600
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
	}
	
}
