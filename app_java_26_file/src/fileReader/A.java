package fileReader;

import java.io.FileReader;
import java.io.IOException;

public class A {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("F:\\hello\\A.txt");
			int val = fr.read();		// it will read the file and store it into val
			System.out.println(val);	// prints the unicode of first character "U". //85
		} catch (IOException e) {		// instead of IOException put only Exception
			e.printStackTrace();
		}
	}
}
