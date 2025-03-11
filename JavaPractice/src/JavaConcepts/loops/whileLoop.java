package JavaConcepts.loops;

public class whileLoop {
	
	public void forloop()
	{
		for(int i=0;i<10;i++)
		{
			System.out.print(i+ " ");
			
			for(int j=0;j<5;j++)
			{
				System.out.print("* ");
			}
			
			
		}
	}
	
	public void whileLoop()
	{
		int i = 0;
		int j = 0;
		while(i<10)
		{
			System.out.println(i+" ");
			while(j<i)
			{
				System.out.print(" *");
				j++;
			}
			
			i++;
			
		}
	}
	
	public static void main(String[] args) {
		whileLoop obj = new whileLoop();
		obj.forloop();
		
		
		
		
		
		
	}
	

}
