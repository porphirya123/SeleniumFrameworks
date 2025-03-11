package trickQuestions.ArrayTricks;

import ArrayUtility.UserInput;

public class MaxAndMinArray {
	
	
	public static void main(String[] args) {
		
		int[] myArray = UserInput.takeInput();
		int max = getMaxElement(myArray);
		System.out.println("Maxium element of the array is = "+max);
		int min = getMinElement(myArray);
		System.out.println("Minimum element of the array is = "+min);
		
	}
	
	public static int getMaxElement(int[] array)
	{
		if(array.length==0)
		{
			return Integer.MIN_VALUE;
		}
		int max=array[0];
		int i=1;
		while(i<array.length)
		{
			if(max<array[i])
			{
				max=array[i];
				
				
			}
			i++;
		}
		return max;
	}
	
	public static int getMinElement (int[] array)
	{
		if(array.length==0)
		{
			return Integer.MIN_VALUE;
		}
		int min=array[0];
		int i=1;
		while(i<array.length)
		{
			if(min>array[i])
			{
				min=array[i];					
			}
			i++;
		}
		
		return min;
	}
	
	

}
