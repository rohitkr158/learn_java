package p1;

//static method in interface

public interface J {
	public static void test();	//ERROR b/c static method in interface cannot be inherited 
								//so we cannot Override static method whether it is complete / incomplete
	
}
