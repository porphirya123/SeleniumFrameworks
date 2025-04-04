package trickQuestions.ArrayTricks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {
	
	
	int[] intArray = {12,33,4,45,2};
	String[] stringArray = new String[4];
	

	
	
	
	/****************Using asList Method *************/
	
	public void ArrayToListWay1()
	{
		stringArray[0] = "Ram";
		stringArray[1] = "Mohan";
		stringArray[2] = "Rohan";
		
		
		List li= Arrays.asList(stringArray);
		System.out.println(li);
		
		for(Object l:li)
		{
			System.out.println(l);
		}
			
	}
	
	
	/****************Using Collection Method *************/
	
	public void ArrayToListWay2()
	{
		String[] names = {"Mohan", "Sohan", "Rohan"};
		List<String> lnames = new ArrayList<>();
		Collections.addAll(lnames, names);
		System.out.println(lnames);

	}
	
	/****************Using for loop Approach *************/
	
	public void ArrayToListWay3()
	{
		
		String[] lastNames = {"Kumar", "Aggarwal", "Singh"};
		List<String> newLastNames = new ArrayList<String>();
//		for(String lastname: newLastNames)
//		{
//			newLastNames.add(lastname);
//		}
//		System.out.println(newLastNames);
		
		for(int i=0;i<lastNames.length;i++)
		{
			newLastNames.add(lastNames[i]);
			
		}
		
		System.out.println(newLastNames);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		ArrayToArrayList obj = new ArrayToArrayList();
		//obj.ArrayToListWay1();
		obj.ArrayToListWay3();
	}
	
	

}
