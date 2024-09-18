package fileReader;

import java.io.File;
import java.io.FileReader;

public class C {
	public static void main(String[] args) {
		File f = new File("F:\\hello\\A.txt");
		try {
			FileReader fr = new FileReader(f);
			for (int i = 0; i < f.length(); i++) { // loop will run till length of the character count present in file

				System.out.print((char) fr.read()); // print instead of println to print in one line
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
