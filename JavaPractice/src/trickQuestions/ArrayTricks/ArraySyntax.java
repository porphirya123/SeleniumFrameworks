package trickQuestions.ArrayTricks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySyntax {
	
	/******************Get Array Value using for Loop *************************/
	public void arraytype1()
	{
		
		
		int arr[] = {3,45,6,66};
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	/*******************************************/
	
	/*****************providing value by User input**************************/
	public void arraytype2()
	{
		
		int[] arr = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		
		}	

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	/*******************************************/
	
	/******************Get Array Value using toString method *************************/
	public void arraytype3()
	{
		
		
		int arr[] = {3,45,6,66};
		
		
	System.out.println(Arrays.toString(arr));
		
		
	}
	/*******************************************/
	
	/******************Get Array Value using for each loop *************************/
	public void arraytype4()
	{
		
		
		int arr[] = {3,45,6,66};
		
		for(int a:arr)
		{		
			System.out.println(a);
		}
		
	}
	/*******************************************/
	
	
	
	public static void main(String[] args)
	{
	ArraySyntax obj = new ArraySyntax();
	obj.arraytype4();
		obj.arraytype3();
		
		
	}
	
	

}
