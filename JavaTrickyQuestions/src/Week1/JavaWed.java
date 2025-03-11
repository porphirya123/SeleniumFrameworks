package Week1;

import java.util.Arrays;
import java.util.Scanner;

import Utilities.Utilities;


public class JavaWed {
	
	public void sortArrayAscending()
	{
		
		int[] arr =  Utilities.takeArrInput();
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp;
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}System.out.println(Arrays.toString(arr));
		
	}
	
	public void sortArrayDecending()
	{
		
		int[] arr = Utilities.takeArrInput();
		int i=0;
		while(i<arr.length)
		{
			int j=i+1;
			while(j<arr.length)
			{
			if(arr[i]<arr[j])  //8,3,4,6,7
			{
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			j++;
			}
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void findMin()
	{
		int[] arr = Utilities.takeArrInput();
		int i=1;
		int min = arr[0];
		while(i<arr.length)
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
			
			i++;
		}System.out.println("Minimum element among all : "+min);
	}
	
	public void findMax()
	{
		
		int[] arr = Utilities.takeArrInput();
		int i=1;
		int max = arr[0];
		while(i<arr.length)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
			
			i++;
		}System.out.println("Maximum element among all : "+max);
		
	}
	
	public void findOccOfElement()
	{
		int[] arr = Utilities.takeArrInput();
		int i=0;
		int num = Utilities.takeIntInput();
		int occ=0;
		while(i<arr.length)
		{
			int temp = arr[i];
			if(temp ==num)
			{
				occ++;
			}
			i++;
		}
		System.out.println("Total Occurance : "+occ);
		
		
	}
	
	public void getFibonachi()
	{
		int num = Utilities.takeIntInput();
		int i=2;
		int first=0;
		int second =1;
		
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
		int rev = 0;
		while(num!=0)
		{
			int temp = num%10;
			rev = rev*10+temp;
			num = num/10;
		}
		System.out.println("Reverse = "+rev);
	}
	
	public boolean isPrime() {
		
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
	
	public void getGCD()
	{
		int num1= Utilities.takeIntInput();
		int num2= Utilities.takeIntInput();
		int i=2;
		int gcd = 1;
		int min = Utilities.getMin(num1, num2);
		while(i<=min)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd = i;
				
			}
			i++;
		}System.out.println("GCD = "+gcd);
		
	}
	
	public void getLCM()
	{
		int num1= Utilities.takeIntInput();
		int num2= Utilities.takeIntInput();
		int i=1;
		int lcm=0;
		while(i<=num1*num2)
		{
			if(i%num1==0 && i%num2==0)
			{
				lcm=i;
				break;
			}
			i++;
		}System.out.println("LCM = "+lcm);
	}
	
	public void sumOfAllDigits()
	{
		
		int num = Utilities.takeIntInput();
		int sum = 0;
		while(num!=0)
		{
			int temp = num%10;
			sum+=temp;
			num = num/10;
		}System.out.println("Total of all digits = "+sum);
	}
	
	public void getFactorial()
	{
		int num = Utilities.takeIntInput();
		int i=1;
		long factorial=1;
		
		while(i<=num)
		{
			factorial*=i;
			i++;
		}
		System.out.println("Factorial = " + factorial);
		
	}
	
	public void getOddNumbers()
	{
		
		int num = Utilities.takeIntInput();
		int i=1;
		int sum = 0;
		while(i<=num)
		{
			System.out.print(i+ " ");
			sum+=i;
			i= i+2;
			
		}
		System.out.println("\nTotal of Odd Numbers = "+sum);
		
	}
	
	
	public void getTable()
	{
		
		int num = Utilities.takeIntInput();
		int i=1;
		while(i<=10)
		{
			System.out.println("Table of "+num+" * "+i+ " = "+ (num*i));
			i++;
		}
		
	}
	
	public void getDivision()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your 1st Number ");
		float num1 = input.nextFloat();
		System.out.print("Enter your 2nd Number ");
		float num2 = input.nextFloat();
		
		System.out.println("Division = "+ (num1/num2));
	}
	
	
	
	
	public static void main(String[] args) {
		
		JavaWed obj = new JavaWed();
		//obj.getTable();
		//obj.getDivision();
		//obj.getOddNumbers();
		//obj.getFactorial();
		//obj.sumOfAllDigits();
		//obj.getLCM();
		//obj.getGCD();
		//System.out.println(obj.isPrime());
		//obj.revDigit();
		//obj.getFibonachi();
		//obj.findOccOfElement();
		//obj.findMax();
		//obj.findMin();
		//obj.sortArray();
		obj.sortArrayAscending();
		
		
	}
	

}
