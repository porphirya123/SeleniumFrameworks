package ArrayTrickQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
	
	public static void sortArray()
	{
		System.out.println("Welcome to Array Trick Questions");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int length = sc.nextInt();
		
		int index =0;
		int[] myArray = new int[length];
		
		while(index<length)
		{
			System.out.println("Enter your first Array");
			
			myArray[index] = sc.nextInt();
			index++;
		}
		
		
		System.out.println(Arrays.toString(myArray));
		
		
	}
	
	public static void main(String[] args) {
		
		sortArray();
		
	}
	

}
