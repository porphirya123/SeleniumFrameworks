package Arrays;

import java.security.DomainCombiner;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayPrac {
	
	int arr[] = {2,3,5,3};
	String[] strarr= {"Santosh", "Ankita", "Atharv"};
	LinkedList llist = new LinkedList();
	List<String> list = new LinkedList();
	String name ;
	
	
	public void arrayToString()
	{
		System.out.println(Arrays.asList(strarr));
	}
	
	
	
	public void ArrayToLinkedList()
	{
		
		
		for(int i=0;i<=strarr.length-1;i++)
		{
			list.add(strarr[i]);
				
		}	
		System.out.println(list);
	}
	
	
	public void arrayStringToList()
	{
		List<String>newlist = new LinkedList();
		Collections.addAll(newlist, strarr);
		System.out.println(newlist);
		
	}
	
	


	public void usingAsList()
	{
		List<String>newNames = new LinkedList();
		newNames = Arrays.asList(strarr);
		System.out.println(newNames);
		
	}
		
	
	
	
	
	
	
	public static void main(String[] args) {
		ArrayPrac obj = new ArrayPrac();
		obj.ArrayToLinkedList();
		obj.arrayStringToList();
		obj.usingAsList();
		obj.arrayToString();
	}
	

}