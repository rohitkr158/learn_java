package p4;

//default (different package sub class)
import p3.F;

public class I extends F {
	public static void main(String[] args) {
		I i = new I();
		System.out.println(i.x);
		i.test();
	}
}
