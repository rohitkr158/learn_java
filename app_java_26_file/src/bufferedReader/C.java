package bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class C {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("F:\\hello\\E.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
