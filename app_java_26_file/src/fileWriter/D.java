package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class D {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("F:\\hello\\E.txt");
			fw.write("Line 1");
			fw.write("\n");			//breaks line
			fw.write("Line 2");
			fw.write("\n");
			fw.write("Line 3");
			fw.write("\n");
			fw.write("Line 4");
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
