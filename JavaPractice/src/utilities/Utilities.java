package utilities;

import java.util.Scanner;

public class Utilities {
	
	public static int SingleInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Provide your input : ");
		int num = sc.nextInt();
		return num;
		}
	
	public static void SingleInputdifferentdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Data Type : ");
		String dataType = sc.next();
		if(dataType.equalsIgnoreCase("integer") || dataType.equalsIgnoreCase("int"))
		{
			System.out.print("Provide your input : ");
			int num = sc.nextInt();
			//return num;

		}
		
		if(dataType.equalsIgnoreCase("float"))
		{
			System.out.print("Provide your input : ");
			float num = sc.nextFloat();
			//return num;

		}
		
		if(dataType.equalsIgnoreCase("double"))
		{
			System.out.print("Provide your input : ");
			double num = sc.nextDouble();
			//return num;
			
		}
			
		if(dataType.equalsIgnoreCase("long"))
		{
			System.out.print("Provide your input : ");
			long num = sc.nextLong();
			//return num;
			
		}
		
		if(dataType.equalsIgnoreCase("byte"))
		{
			System.out.print("Provide your input : ");
			byte num = sc.nextByte();
			//return num;
			
		}
		
		
		
	}
	

	
	
}
