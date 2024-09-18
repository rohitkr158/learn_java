package createNewFile;

import java.io.File;
import java.io.IOException;

public class A {
	public static void main(String[] args) {
		try {
			File f = new File("F:\\hello\\A.txt");
			System.out.println(f);
			boolean val = f.createNewFile();
			System.out.println(val);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
