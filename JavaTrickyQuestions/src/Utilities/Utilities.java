package Utilities;

import java.util.Scanner;

public class Utilities {
	
	public static int takeIntInput()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Number ");
		int num = input.nextInt();
		return num;
	}
	
	public static int[] takeArrInput()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Elements Size ");
		int  size = input.nextInt();
		int[] arr = new int[size];
		int i=0;
		while(i<arr.length)
		{
			System.out.print("Enter your "+(i+1)+" Element ");
			arr[i] = input.nextInt();
			i++;
		}
		
		return arr;
	}
	
	public static int getMin(int num1, int num2)
	{
		if(num1<num2)
		{
			return num1;
		}
		return num2;
	}
	
	

}
