package MathTrics;

public class MathTricks {
	
	public void getFibonachi(int num)
	{
		int firstindex = 0;
		int nextindex = 1;
		int count =2;
		while(count<=num)
		{
			int temp = nextindex;
			nextindex = nextindex+firstindex; 
			firstindex = temp;
			count++;
			
		}System.out.println(nextindex); //0,1,1,2,3,5,8
		
	}
	
	public void findOccurance(int num)
	{
		int val = 23322344;
		int count=0;
		while(val!=0)
		{
			int occ = val%10;
			if(occ==num)
			{
				
				count++;
			}
			val = val/10;
			
		}System.out.println(count);

	}
	
	
	public void revNum(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int temp = num%10;
			rev = rev*10+temp;
			num = num/10;
			
		}
		System.out.print(rev);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		MathTricks obj = new MathTricks();
		obj.getFibonachi(6);
		obj.findOccurance(4);
		obj.revNum(323245);
	
	}
	
}


