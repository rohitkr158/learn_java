package pre_decrement;

public class B {
	public static void main(String[] args) {
		int i = 20;
		int j = (--i) + i + (--i) + i + (--i) + (--i);
		System.out.println(i);
		System.out.println(j);
	}
}
