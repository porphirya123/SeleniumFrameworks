package BasicLogicTrickQuestions;

import utilities.Utilities;

public class SumOfOddNumbers {
	
	
	public static void sumOfAllODDNumbers()
	{
		int num = Utilities.SingleInput();
		
		int i =1;
		int sum = 0;
		while(i<num)
		{
			
			if(num%2!=0)
			{
				sum = sum+num;
			}
			
			i++;
		}
		System.out.println("Total of All Odd numbers = "+sum);
		
	}
	
	public static void main(String[] args) {
		
		sumOfAllODDNumbers();
		
	}
	
	
	

}
