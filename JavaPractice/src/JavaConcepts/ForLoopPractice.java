package JavaConcepts;

public class ForLoopPractice {
	
	
	public void printstars()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			for(int j=1;j<=i;j++)
			{
				System.out.println(j);
				for(int k=1;k<=j;k++)
				{
					System.out.print(k);
				}	System.out.println();
			}
			System.out.println();
		}
	}
	
	
	/*********************print only even no between 1 to 50 ********************/
	
	public void printeven()
	{
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.println("This number : "+i+" is an Even Number");
			}
		}
	}
	
	
	
	/********************Reverse a number ******************/
	public void nestedLoop()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println("Hello J");
			}
			
		System.out.println("Hello I");
		}
	}
	
	
	public void printStar()
	{
		for(int i=1;i<=5;i++)
		{
					
		System.out.println("*");
		}
	}
	
	
	/** Method Insertion */
	
	public static void Loop(int num)
	{
		if(num<=80)
		{
			System.out.println(num);
			Loop(num+1);
		}
	}
	
	
	
		
	/** For Loop logic */
	
	
	
	
	public static void main(String[] args)

	{
		ForLoopPractice obj = new ForLoopPractice();
		obj.printstars();
	}
	
}
