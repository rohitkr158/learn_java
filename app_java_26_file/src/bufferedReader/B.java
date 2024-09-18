package bufferedReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class B {
	public static void main(String[] args) {
		File f = new File("F:\\hello\\E.txt");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			char[] ch = { 'a', 'b', 'c' };
			br.read();
			for (char c : ch) {
				System.out.println(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
