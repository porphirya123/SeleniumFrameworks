package JavaConcepts;

public class CustomException {

public static void main(String[] args) {
		
		int a =10;
		int b =0;
		
		try
		{
		int c= a/b;
		
		
			throw new SantoshException("This is custom exception");
		
		}catch (SantoshException e)
		{
			System.out.println("Division can't divide any number" +e);
		}
	
	
	
}

class SantoshException extends Exception
	{
	
	public SantoshException(String text)
	{
		super(text);
	}
		
	
	
	
		
		
	}
	
}
