package com.packageA;

import java.util.ArrayList;

public class CollectionFramework {
	
	public void ArrayListDemo()
	{
		ArrayList al = new ArrayList();
		al.add("Test");
		al.add(3);
		al.add(34);
		al.add("c");
		
		//System.out.println(al);
		
//		for(Object a: al)
//		{
//			System.out.println(a);
//		}
		
		System.out.println(al.size());
		
		
		int size = al.size();
		int index = 0;
		while(size>=al.size())
		{
			Object l = al.get(size);
			
			System.out.println(l);
			size++;
		}
	
		
		
	}
	
	public static void main(String[] args) {
		
		CollectionFramework obj = new CollectionFramework();
		obj.ArrayListDemo();

