package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class A {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("F:\\hello\\D.txt",true);	//true will append new value without deleting the previous one
			fw.write('a');			//print char
			fw.write(19);			//print integer
			fw.write("mike");		//print string
			fw.write("hii");
			fw.close();				//saves the file
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
