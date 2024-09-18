package fileReader;

import java.io.File;
import java.io.FileReader;

public class D {
	public static void main(String[] args) {
		File f = new File("F:\\hello\\A.txt");
		try {
			FileReader fr = new FileReader(f);
			char[] ch = new char [(int)f.length()];
			fr.read(ch);
			
			for (char c : ch) {
				System.out.print(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
