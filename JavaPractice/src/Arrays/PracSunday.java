package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PracSunday {
	
	String arr[] = {"Santosh", "Ankita", "Atharv"};
	String name[] = {"Santosh", "Ankita", "Atharv"};
	int age[] = {2,3,4,6,7};
	int newage[] = new int[5];
	Object[] o= new Object[5];
	List list = new LinkedList();
	
	
	public void compare()
	{
		int result = Arrays.compare(arr, name);
		if(result==0)
		{
			System.out.println("Matched");
		}else
		{
			System.out.println("No match");
		}
		
	}
	
	
	public void intToList()
	{
		
		for(int i=0;i<age.length;i++)
		{
			list.add(age[i]);
		}
		System.out.println(list);
	}
	
	
	public void copyArray()
	{
		for(int i=0;i<age.length;i++)
		{
			newage[i]=age[i];
		}
		
		for(int j=0;j<age.length;j++)
		{
			System.out.println(newage[j]);
		}
	}
		
	public void newarray()
	{
		
		Arrays.copyOf(age, newage.length);
		
		for(int a:age)
		{
			System.out.println(a);
		}

	}
	
		
	public static void main(String[] args) {
		
		PracSunday obj = new PracSunday();
//		obj.compare();
//		obj.intToList();
		obj.newarray();
		
	}
	
	
	
	
	
	
	
	
	

}