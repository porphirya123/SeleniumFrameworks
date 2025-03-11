package trickQuestions.Mathtricks;

import java.util.Scanner;

public class FindLCM {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Math Trick Questions");
		System.out.println("Lets find out LCM of 2 Numbers!!!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second number ");
		int num2 = sc.nextInt();	
		
		int lcm = getLCM(num1, num2);
		System.out.println("lcm = "+lcm);
		
	}
	
	public static int getLCM(int num1, int num2)
	{
		
		int i=1;
		
		while(true)
		{
			int factor = i*num1;
			if(factor%num2==0)
			{
				return factor;
			}
			i++;
		}
		
	}

}
