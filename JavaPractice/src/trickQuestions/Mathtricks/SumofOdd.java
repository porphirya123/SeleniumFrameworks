package trickQuestions.Mathtricks;

import java.util.Scanner;

public class SumofOdd {
	
public static void main(String[] args) {
		
		System.out.println("Welcome to Math Trick Questions");
		System.out.println("Welcome to Sum of All Digits Challenge!!!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int num = sc.nextInt();	
		int oddSum = sumOfAllOdds(num);
		System.out.println("Sum of all odd numbers = "+oddSum);
		
}

		public static int sumOfAllOdds(int num)
		{
			int i=0;
			int oddSum = 0;
			while(i<=num)
			{
				if(i%2==0)
				{
					oddSum = oddSum+i;
					
				}
				i++;
			}
			
			return oddSum;
		}


}

