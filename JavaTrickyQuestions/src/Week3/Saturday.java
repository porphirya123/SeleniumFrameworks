package Week3;

import Utilities.Utilities;

public class Saturday {
	
	public void printPattern()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			
			for(int j=5;j<=0;j--)
			{
				System.out.print(" ");
			}
			
			
			System.out.println();
		}
		
		
	}
	
	public void printFibonachi()
	{
		int num = Utilities.takeIntInput();
		int first = 0;
		int second = 1;
		int i = 2;
		if(num<0) return;
		System.out.print("0 ");
		if(num==0) return;
		System.out.print("1 ");
		
		while(i<=num)
		{
			int third = first+second;
			first = second;
			second = third;
			System.out.print(third+" ");
			i++;
		}
	}
	
	public void revDigits()
	{
		int num = Utilities.takeIntInput();
		int rev = 0;
		while(num!=0)
		{
			int temp = num%10;
			rev = rev*10+temp;
			num = num/10;
			
			
		}
		System.out.println("Reverse Digit is "+rev);
	}
	
	public void findGCM()
	{
		int num1 = Utilities.takeIntInput();
		int num2 = Utilities.takeIntInput();
		
		int i=1;
		int gcd=0;
		int min = Utilities.getMin(num1, num2);
		while(i<=min)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd =i;
			
			}
			i++;
		}
		System.out.println("GCD is "+gcd);
	}
	
	public void findLCM()
	{
		int num1 = Utilities.takeIntInput();
		int num2 = Utilities.takeIntInput();
		
		int i=1;
		int lcm=0;
		while(i<=num1*num2)
		{
			if(i%num1==0 && i%num2==0)
			{
				lcm =i;
				break;
			}
			i++;
		}
		System.out.println("LCM is "+lcm);
	}
	
	public void getSumofAllDigits()
	{
		int num = Utilities.takeIntInput();
		int i=0;
		int sum = 0;
		while(num!=0)
		{
			int temp = num%10;
			sum+=temp;
			num=num/10;
			
		}
		System.out.println("Sum of all Digits " + sum);
	}
	
	public void getFactorial()
	{
		int num = Utilities.takeIntInput();
		int i = 1;
		long fac=1;
		while(i<=num)
		{
			fac = fac*i;
				i++;
		}
		System.out.println(fac);
		
	}
	
	public void sumOfAllOddNumbers()
	{
		int num = Utilities.takeIntInput();
		int i=1;
		int sum = 0;
		while(i<=num)
		{
			sum+=i;
			i=i+2;
		}
		System.out.println("Sum of All Odd Numbers = "+sum);
	}
	
	public void getTable()
	{
		int i=1;
		int num = Utilities.takeIntInput();
		while(i<=10)
		{
			System.out.println(i*num);
			i++;
		}
	}
	
	public void printInitialName()
	{
		String name = Utilities.takeString();
		int i=0;
		String[] txt = name.split(" ");
		while(i<txt.length-1)
		{			
			System.out.print(txt[i].charAt(0)+". ");
			i++;
		}
		System.out.print(txt[txt.length-1]);
	}

	
	public static void main(String[] args) {
		Saturday s = new Saturday();
		//s.printInitialName();
		//s.getTable();
		//s.sumOfAllOddNumbers();
		//s.getFactorial();
		//s.getSumofAllDigits();
		//s.findLCM();
		//s.findGCM();
		//s.revDigits();
		//s.printFibonachi();
		s.printPattern();
	}
}
