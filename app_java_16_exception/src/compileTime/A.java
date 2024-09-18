package compileTime;

import java.io.FileReader;

public class A {
	public static void main(String[] args) {
		FileReader fr = new FileReader("G://test1.txt");   //fileNotFoundexception
	}
}
