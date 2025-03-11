package trickQuestions.Mathtricks;

import java.util.Scanner;

public class FindPrime {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println(checkPrime(num));
		
		
	}
	
	
	public static boolean checkPrime(int num)
	{
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

	
	
	
}
