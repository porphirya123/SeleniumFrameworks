package fileReadAndWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
	
	
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("demo.txt");
		BufferedWriter filewrite = new BufferedWriter(fw);
		filewrite.write("This is Demo");
		filewrite.newLine();
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<3;j++)
			{
				int val = (int)(Math.random()*100);
				filewrite.write(val + "\t");
			
			
			}filewrite.newLine();
			
		}	
		filewrite.close();
		System.out.println("Successful");
		
		BufferedReader reader = new BufferedReader(new FileReader("demo.txt"));
		System.out.println(reader.readLine());
		String line ;
		
		while((line=reader.readLine())!=null)
		{
			System.out.println(line);
		}
		reader.close();
		
		
	}
	
	

}
