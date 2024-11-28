package printPattern;

public class PatternOne {

	public void pattern(int num)
	{
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.print("* ");
			}System.out.println();
		}
					
	}
	
	

	public void patterntwo(int num)
	{
		try
		{
			
		}catch(Exception e);
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}System.out.println();
		}
					
	}
	
	
	
	
	
	public static void main(String[] args) {
		PatternOne obj = new PatternOne();
		obj.pattern(4);
		obj.patterntwo(4);
	}
	
}
