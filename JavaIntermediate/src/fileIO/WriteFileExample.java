package fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileExample {
	
	public static void main(String[] args) {
		
		try {
			Writer w=new FileWriter("C:\\Users\\Owais\\eclipse-workspace\\QAFiles\\owais.txt");
			String content="Welcome to the world of java, this is harder than i thought lol";
			w.write(content);
			w.close();
			System.out.println("file was written successfully");
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
