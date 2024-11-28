package JavaConcepts;

public class RecursionDemo {
	
	public static void printnum(int num)
	{
		System.out.println(num);
		
		if(num>=10)
		{
			return;
		}
		else
		{
			printnum(num+1);
		}
		
		
	}
	
	
	public void reversename(String name)
	{
		
	}
	
	

	
	public static void main(String[] args) {
		
		printnum(1);
		
		
	}
	
	
}


//for(int i=0;i<10;i)