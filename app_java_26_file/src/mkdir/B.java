package mkdir;

import java.io.File;

public class B {
	public static void main(String[] args) {
		File f = new File("f:\\hello\\p1");
		boolean val = f.delete(); // it will delete the folder and return true
		System.out.println(val);
	}
}
