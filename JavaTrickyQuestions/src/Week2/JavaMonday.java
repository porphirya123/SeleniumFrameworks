package Week2;

import Utilities.Utilities;

public class JavaMonday {
	
	public void sumofAllElements()
	{
		
		int[] num = Utilities.takeArrInput();
		int i=0;
		int sum = 0;
		while(i<num.length)
		{
			sum+=num[i];
			i++;
		}
		System.out.println("Sum of all Elements = "+sum);
	}
	
	
	public boolean isPalindrome()
	{
		
			int num = Utilities.takeIntInput();
			int basenum=num;
			int revdigit = 0;
			while(num!=0)
			{
				int temp = num%10;
				revdigit = revdigit*10+temp;
				num = num/10;
				
			}
			
			if(basenum==revdigit)
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not Palindrome");
			}
		
		
		return true;
	}
	
	public void printFinoachi()
	{
		
		int first = 0;
		int second = 1;
		int num = Utilities.takeIntInput();
		int i= 2;
		
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
	
	public void revDigit()
	{
		int num = Utilities.takeIntInput();
		int revdigit = 0;
		while(num!=0)
		{
			int temp = num%10;
			revdigit = revdigit*10+temp;
			num = num/10;
			
		}
		System.out.println("Your Reverse Digit is "+revdigit);
		
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
	
	public void printPrime()
	{
		boolean status = isPrime();
		if(status)
		{
			System.out.println("The number is Prime!");
		}
		else
		{
			System.out.println("The Number is NOTPrime!");
		}
	}
	
	
	public void findGCD()
	{
		int num1 = Utilities.takeIntInput();
		int num2 = Utilities.takeIntInput();
		int gcd = 0;
		int i=1;
		int min = Utilities.getMin(num1, num2);
		
		while(i<num1)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd = i;
			}
			i++;
		}System.out.println("GCD = "+gcd);
		
	}
	
	public void findLCM()
	{
		int num1 = Utilities.takeIntInput();
		int num2 = Utilities.takeIntInput();
		int lcm = 0; // 
		int i=2;
		while(i<=num1*num2)
		{
			if(i%num1==0 && i%num2==0)
			{
				lcm = i;
				break;
			}
			i++;
		}
		System.out.println("LCM = "+lcm);
	}
	
	public void getSumOfAllDigits(int num)
	{
		int i=0;
		int sum=0;
		while(num!=0)
		{
			int temp = num%10;
			sum+=temp;
			num = num/10;
		}
		System.out.println("Sum of all Digits "+sum);
		
	}
	
	public void getFactorial()
	{
		int i=1;
		long factorial=1;
		int num = Utilities.takeIntInput();
		while(i<=num)
		{
			factorial = factorial*i;
			i++;
		}
		System.out.println("Factorial is "+factorial);
		
	}
	
	public void getSumofOddNumber()
	{
		
		int num = Utilities.takeIntInput();
		int i=1;
		int sum=0;
		while(i<num)
		{
			sum+=i;
			i=i+2;
		}
		System.out.println("Sum of all Odd Numbers = "+sum);
		
	}
	
	public void getTable()
	{
		
		int num = Utilities.takeIntInput();
		int i=1;
		while(i<=10)
		{
			System.out.println("Table is = "+(i*num));
			i++;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		JavaMonday obj = new JavaMonday();
		//obj.getTable();
		//obj.getSumofOddNumber();
		//obj.getFactorial();
		//obj.getSumOfAllDigits(1234);
		//obj.findLCM();
		//obj.findGCD();
		//obj.printPrime();
		//obj.revDigit();
		//obj.printFinoachi();
		//obj.isPalindrome();
		obj.sumofAllElements();
	}

}
