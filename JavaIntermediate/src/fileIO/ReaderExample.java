package fileIO;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
	public static void main(String[] args) {

		try {
			Reader r = new FileReader("C:\\\\Users\\\\Owais\\\\eclipse-workspace\\\\QAFiles\\\\owais.txt");
			int data = r.read(); // only first character
			while(data != -1) // loop through all characters
			{
			System.out.println((char)data);
			data=r.read(); // read next character
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
