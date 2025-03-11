package trickQuestions.ArrayTricks;

import java.util.Scanner;

import ArrayUtility.UserInput;

public class Occurance {
	
	public static void main(String[] args) {
		
		int[] myarray = UserInput.takeInput();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number which you want to find the occurance ");
		int num = input.nextInt();
		int occurance = getOccurance(myarray,num );
		System.out.println(occurance);
		
	}
	
	public static int getOccurance(int[] array, int num)
	{
		int occurance = 0;
		int index = 0;
		while(index<array.length)
		{
			if(array[index]== num)
			{
				occurance++;
			}
		 index++;	
		}
		
		
		return occurance;
	}
	

}
