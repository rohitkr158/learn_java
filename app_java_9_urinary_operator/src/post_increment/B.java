package post_increment;

public class B {
	public static void main(String[] args) {
		int i = 10;
		int j = (i++) + (i++) + (i++);
		System.out.println(i);
		System.out.println(j);
	}
}
