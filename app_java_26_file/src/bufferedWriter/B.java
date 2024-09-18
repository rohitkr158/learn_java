package bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class B {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("F:\\hello\\B.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(100);
			bw.newLine();
			bw.write("mike");
			bw.newLine();
			bw.write('a');
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
