package BasicLogicTrickQuestions;

import java.util.Scanner;

import utilities.Utilities;

public class Table {
	
	
	public static void getTable()
	{
		int num = Utilities.SingleInput();
		int i=1;
		while(i<=10)
		{
			
			System.out.println("Table of input " + " is : "+num+" * "+i+" = "+num*i);
			
			i++;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		getTable();
		
	
	}
	
}
