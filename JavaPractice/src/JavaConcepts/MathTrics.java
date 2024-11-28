package JavaConcepts;

public class MathTrics {

	
	/***********Find out reverse order*******************/
	
	public void reverseNum()

	{
		int num = 123455;
		int rev = 0;
		while(num!=0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
			
		}System.out.println(rev);
	}
	
	/***********Find out a specific number count in whole number*******************/
	
	public void checkNumCount()
	{
		long num = 23233522453l;
		int count =0;
		while(num!=0)
		{
			int rem = (int)num%10;
			if(rem==2)
			{
				
				count++;
			}
			num=num/10;
		}System.out.println(count);
		
	
	}

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		MathTrics obj = new MathTrics();
		obj.reverseNum();
	}
	
}
