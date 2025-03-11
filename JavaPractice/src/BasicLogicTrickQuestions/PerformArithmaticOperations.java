package BasicLogicTrickQuestions;

import utilities.Utilities;

public class PerformArithmaticOperations {
	
	
	public static void add()
	{
		int first = Utilities.SingleInput();
		int second = Utilities.SingleInput();
		
		int sum = first+second;
		System.out.println("Sum of provided 2 numbers is : "+sum);
		
	}
	
	public static void multiply()
	{
		int first = Utilities.SingleInput();
		int second = Utilities.SingleInput();
		
		int multiply = first*second;
		System.out.println("Multiply of provided 2 numbers is : "+multiply);
		
	}
	
	public static void division()
	{
		int first = Utilities.SingleInput();
		int second = Utilities.SingleInput();
		
		int div = first/second;
		System.out.println("Division of provided 2 numbers is : "+div);
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		add();
		multiply();
		division();
	}
	

}
