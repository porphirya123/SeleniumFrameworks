package Arrays;

import java.util.Arrays;

public class CopyArray {
	

	/** Copy Array String using Copy of Method & for loop (manual approach)*/
	
	public void copyString()
	{
		
	String[] firstnames = {"Ankita", "Santosh", "Atharv", "Saanchi"};
	
	/** Copy Array using Copy of Method */
	String[] lastnames = Arrays.copyOf(firstnames, firstnames.length);
	for(String ln:lastnames)
	{
		System.out.println(ln);
	}
	
	
	/** Copy Array using for loop (manual approach)*/
	
	String name[] = new String[4];
		
	for(int i=0;i<firstnames.length;i++)
	{
		name[i]=firstnames[i];
	}
	
	for(String n:name)
	{
	System.out.println(n);

	}
	
	}
	
	
	/** Copy Array using Copy of Method & for loop (manual approach)*/
	
	public void copyInt()
	{
		int rolls[] = {12,33,44,22,53};
		int ages[] = new int[4];
		ages[0] = 10;
		ages[1] = 1;
		ages[2] = 13;
		ages[3]= 44;
	
		/** Copy Array using Copy of Method */
		
		int nums[] = Arrays.copyOf(ages, ages.length);
		
		for(int nu:nums)
		{
			System.out.println("Copy Array using CopyOf Method : " + nu);
		}
		
		/** Copy Array using for loop (manual approach)*/
		
		int[] num= new int[5];	
		
		for(int i=0;i<rolls.length;i++)
		{
			num[i] = rolls[i];
			
		}
		
		for(int n:num)
		{
			System.out.println("Copy Array using for loop : " + n);
		}
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		CopyArray obj = new CopyArray();
		obj.copyInt();
		obj.copyString();


}
}

