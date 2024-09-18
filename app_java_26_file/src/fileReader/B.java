package fileReader;

import java.io.File;
import java.io.FileReader;

public class B {
	public static void main(String[] args) {
		File f = new File("F:\\hello\\A.txt");
		try {
			FileReader fr = new FileReader(f); 			// fileNotFoundException will always surrounds in try catch block
			for (int i = 0; i < 4; i++) { 				// if i < 4 the loop will only run 4 times of the index value,
														// so all character will not be checked
				System.out.print((char) fr.read()); 	// fr.read() will read all the characters in unique code in the
														// given file then convert it into character.
			}
		} catch (Exception e) {							//instead of IOException we used Exception
			e.printStackTrace();
		}
	}
}
