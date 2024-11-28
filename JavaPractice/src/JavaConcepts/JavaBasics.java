package JavaConcepts;

import java.util.Scanner;

public class JavaBasics {
	
	public void FindLargerNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int a =sc.nextInt();
		System.out.println("Enter 2nd Number : ");
		int b=sc.nextInt();
		System.out.println("Enter 3rd Number : ");
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("The bigger of amoung 3 number is : " + a);
		}
		else if(b>a && b>c)
		{
			System.out.println("The bigger of amoung 3 number is : " + b);
		}
		else if(c>a && c>b)
		{
			System.out.println("The bigger of amoung 3 number is : " + c);
		}
		
	}

	
	public int revValue(int num)
	{
		int rev = 0;
		while(num>0)
		{
		
			int rem = num%10;
			rev = rev*10+rem;
			num=num/10;
			
			
		}
		return rev;
		
	}
	
	
	/********Check the count of a specific number*****/
	
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
	
	
	public int revValueRecursion(int num)
	{
		int rev = 0;
	
		while(num!=0)
			{
			int rem = num%10;
			rev = rev*10+rem;
			revValueRecursion(num/10);
			
		}
		return rev;
	
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		JavaBasics obj = new JavaBasics();
		obj.checkNumCount();
	
		
		
	}

}
