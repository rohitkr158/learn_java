package bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class D {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("F:\\hello\\E.txt");
			BufferedReader br = new BufferedReader(fr);
			for (int i = 0; i < 7; i++) {
				System.out.println(br.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
