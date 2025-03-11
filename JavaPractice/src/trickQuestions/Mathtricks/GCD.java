package trickQuestions.Mathtricks;

import java.util.Scanner;

public class GCD {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd Number");
		int num2 = sc.nextInt();
		
		int GCD = findGCD(num1, num2);
		System.out.println("GCD of provided 2 numbers is : "+ GCD);
		
	}
	
	public static int findGCD(int first, int second)
	{
		int gcd= 1;
		int i =2;
		int lowest = findlowest(first, second);
		while(i<=lowest )
		{
			if(first%i==0 && second%i==0)
			{
				gcd = i;
			}
			i++;
		}
		
		
		return gcd;
	}
	
	
	public static int findlowest(int num1, int num2)
	{
		if(num1<num2)
		{
			return num1;
		}
		else	
			return num2;
	}
	
	

}
