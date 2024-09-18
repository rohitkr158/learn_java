package delete;

import java.io.File;

public class A {
	public static void main(String[] args) {
		File f = new File("F:\\hello\\A.txt");
		System.out.println(f);
		boolean val = f.delete();
		System.out.println(val); // after deleting it will return true (boolean value)
	}
}
