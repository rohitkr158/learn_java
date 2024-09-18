package mkdir;

import java.io.File;

public class A {
	public static void main(String[] args) {
		File f = new File("F:\\hello\\p2");
		System.out.println(f);
		boolean val = f.mkdir();
		System.out.println(val);
	}
}
