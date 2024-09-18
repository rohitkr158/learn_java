package bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class A {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("F:\\hello\\E.txt");
			BufferedReader br = new BufferedReader(fr);	//cannot take path
			System.out.println((char) br.read());		//it will read only one letter
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
