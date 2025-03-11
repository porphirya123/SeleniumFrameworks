package trickQuestions.Mathtricks;

import java.util.Scanner;

public class CheckPrime {
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Math Trick Questions");
		System.out.println("Prime No");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int num = sc.nextInt();
		
		
		boolean prime = checkPrime(num);
		if(!prime)
		{
			System.out.println("Your number "+num+" is not Prime!");
		}else
		System.out.println("Your number "+num+" is Prime!!");
	
		}
	
		public static boolean checkPrime(int num)
		{
			
			int i= 2;
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
	
	

}
