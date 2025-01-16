package fileReadAndWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateHTMLFile {
	
	
	public static void main(String[] args) throws IOException {
	
		FileWriter fw = new FileWriter("test.html");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("<html><body>Welcome to Java Learning<title> Hello Java</title></body></html>  ");
		bw.close();
		
		FileWriter fww = new FileWriter("Exceldemo.csv");
		BufferedWriter bww = new BufferedWriter(fww);
		bww.write("Hi");
		bww.close();
		
		System.out.println("File created Successfully!!!!");
		
	}
	
	
	
	

}
