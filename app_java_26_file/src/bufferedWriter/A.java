package bufferedWriter;
																										
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("F:\\hello\\E.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write('n');
			bw.write(87);
			bw.write("mike");
			char[] ch = { 'd', 'h', 'k' };
			bw.write(ch);
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}