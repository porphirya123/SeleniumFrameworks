package trickQuestions.Mathtricks;

import java.util.Scanner;

public class SumofDigits {
	
	
public static void main(String[] args) {
		
		System.out.println("Welcome to Math Trick Questions");
		System.out.println("Welcome to Sum of All Digits Challenge!!!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int num = sc.nextInt();	
		
		int sumofDigits = sumOfDigits(num); 
		System.out.println("Sum of all digits for given number "+num+" is : "+sumofDigits);
}
				
		public static int sumOfDigits(int num)
		{
			int i=0;
			int sum =0;
			while(num!=0)
			{
				int rem = num%10; //234
				sum = sum+rem;
				num = num/10;
			}

			return sum;
		}
	
}
