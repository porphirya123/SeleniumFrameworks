package exceptionHandling;

import java.io.IOException;

public class ExceptionThrows {
	
	
	public void printtext() throws IOException
	{
	{
	int num=10;
	System.out.println(num/0);
	}
	}
	
	public static void main(String[] args) {

		ExceptionThrows obj = new ExceptionThrows();
		try {
			obj.printtext();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


class Demo extends ExceptionThrows
{
	
	public void print() throws IOException
	{
		System.out.println("Test");
		printtext();
	}
	
}
