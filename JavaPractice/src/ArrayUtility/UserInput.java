package ArrayUtility;

import java.util.Scanner;

public class UserInput {
	
	
	public static int[] takeInput()
	{
		
		System.out.println("Welcome to Arrays!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your array Size =  ");
		int size = sc.nextInt();
		int[] array = new int[size];
		int i=0;
		while(i<size)
		{
			System.out.println("Please Enter your array element no : "+(i+1)+" = ");
			array[i] = sc.nextInt();
			i++;
		}
		return array;
		
		
	}

}
