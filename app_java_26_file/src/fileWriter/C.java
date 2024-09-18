package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class C {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("F:\\hello\\E.txt");
			char[] ch = {'a', 'b', 'c'};			//array of char
			fw.write(ch);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
