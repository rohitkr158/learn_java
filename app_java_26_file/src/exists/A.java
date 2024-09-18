package exists;

import java.io.File;

public class A {
	public static void main(String[] args) {
		File f = new File("F:\\hello\\A.txt");
		System.out.println(f);
		boolean val = f.exists();
		System.out.println(val);
	}
	
}
