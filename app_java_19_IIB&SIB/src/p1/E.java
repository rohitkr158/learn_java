package p1;

public class E {
	{
		new E();
	}
	public static void main(String[] args) {
		E e1 = new E();			//program will halt abruptly
		System.out.println("from main");
	}
}
