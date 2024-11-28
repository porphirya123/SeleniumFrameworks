package com.packageA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class JavaBasics {
	
	public void checkarray()
	{
	int[] arr=new int[4];
	
	arr[0]= 10;
	arr[1] = 20;
	
	for(int a:arr)
	{
		System.out.println(a);
	}

	
	int roll[]= new int[4];
	roll[0]=10;
	roll[1]=33;
	
	for(int b:roll)
	{
		System.out.println(b);
	}
	
	String[] name= {"Santosh", "Ankita", "Atharv", "Saanchi"};
	int len= name.length;
	
	for(String n:name)
	{
		System.out.println(n);
	}
			
	
	List l = Arrays.asList(name);
	//Set<String> set = convertArrayToSet(name);  - ****this doesn't work
	
	
	System.out.println(l);
	
	


	
	}
	
	
	
	
	
	

	
	
	

	private Set<String> convertArrayToSet(String[] name) {
		// TODO Auto-generated method stub
		return null;
	}











	public static void main(String[] args) {
		
		JavaBasics j=new JavaBasics();
		j.checkarray();

	}

}
