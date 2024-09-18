package app_java_3;

public class J{
	public static void main(String[] args) {
		J j1 = new J();
		System.out.println(this);   //ERROR
									//we cannot access this keyword in
									//static method and b/c of local 
									//reference variable only a1 can
									//be used where object is created.
		j1.test();
	}
	public void test() {
		System.out.println(this);	//this can be used here in non-
									//static method
	}
}

