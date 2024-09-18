package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class B {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("F:\\hello\\D.txt");
			fw.write(97);			//prints ascii value o f97 i.e.  a
			fw.write('b');
			fw.write("rohit");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
