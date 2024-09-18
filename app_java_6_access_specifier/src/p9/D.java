package p9;

//Access specifier on a class
//default (same package sub class)

class D extends C {
	public static void main(String[] args) {
		D d1 = new D();
		System.out.println(d1);
	}
}


//default(different package) is in p10 class E.