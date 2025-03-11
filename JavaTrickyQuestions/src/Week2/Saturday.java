package Week2;

import Utilities.Utilities;

public class Saturday {
	
	public void printPattern()
	{
		int size = Utilities.takeIntInput();
		for(int i=0;i<size;i++)
		{
			for(int j=size/2;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
			System.out.print("* ");	
			}System.out.println();
		}
		
		
	}
	
	
	public boolean isPrime()
	{
		
		int num = Utilities.takeIntInput();
		int i=2;
		while(i<num)
		{
			if(num%i==0)
			{
				return false;
				
			}
			i++;
				
		}
		return true;
	}
	
	public void getFactorial()
	{
		int num= Utilities.takeIntInput();
		long fac = 1;
		int i = 1;
		while(i<=num)
		{
			fac = fac*i;
			i++;
		}
		System.out.println(fac);
	}
	
	public void getFibonachi()
	{
		
		int num = Utilities.takeIntInput();
		int first = 0;
		int second = 1;
		int i=2;
		if(num<0) return;
		System.out.print("0 ");
		if(num==0) return;
		System.out.print("1 ");
		while(i<=num)
		{
			int temp = first+second;
			first = second;
			second = temp;
			System.out.print(temp+" ");
			i++;
		}
		
	}
	
	public void getGCD()
	{
		int num1 = Utilities.takeIntInput();
		int num2 = Utilities.takeIntInput();
		int i=2;
		int gcd =1;
		int min = Utilities.getMin(num1, num2);
		while(i<=min)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd =i;
			}
			i++;
		}System.out.println("Here is the GCD "+gcd);
		
	}
	
	public void getLCM()
	{
		int num1 = Utilities.takeIntInput();
		int num2 = Utilities.takeIntInput();
		int i=2;
		
		while(i<=num1*num2)
		{
			if(i%num1==0 && i%num2==0)
			{
				System.out.println(i);
				break;
			}
			i++;
		}
		
	}
	
	public void revDigits()
	{
		int num = Utilities.takeIntInput();
		int rev =0;
		while(num!=0)
		{
			
			int temp = num%10;
			rev= rev*10+temp;
			num=num/10;
		}
		System.out.println("Here is the Reverse One "+rev);
	}
	
	public void sumOfAllDigits()
	{
		int num = Utilities.takeIntInput();
		int sum =0;
		while(num!=0)
		{
			int temp =0;
			temp = num%10;
			sum+=temp;
			num=num/10;
		}
		System.out.println("Sum of All Digits = "+sum);
	}
	
	public void printAllOddNums()
	{
		int num = Utilities.takeIntInput();
		int i=1;
		int sum=0;
		while(i<num)
		{
			System.out.print(i+" ");
			sum+=i;
			i=i+2;
			
		}System.out.println("Sum of all Odd Numbers = "+sum);
	}

	public void getTable()
	{
		int num = Utilities.takeIntInput();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*num);
		}
	}
	
	public static void main(String[] args) {
		Saturday o = new Saturday();
		//o.getTable();
		//o.printAllOddNums();
		//o.sumOfAllDigits();
		//o.revDigits();
		//o.getLCM();
		//o.getGCD();
		//o.getFibonachi();
		//o.getFactorial();
//		boolean state =o.isPrime();
//		System.out.println(state);
		o.printPattern();
		
		
	}
	
}
