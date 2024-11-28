package com.project.rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JavaPracTuesday {

	public void revText(String text)
	{
		String revText = "";
		for(int i=text.length()-1;i>=0;i--)
		{
			
			System.out.print(text.charAt(i));
			
		}System.out.println();
	
	}
	
	
	public void countWord(String Sen)
	{
		String[] words = Sen.split(" ");
		System.out.println("Total count in given sentence is : "+words.length);
		
		
	}
	
	
	public void countOccurance(String word)
	{
		
		HashMap<Character, Integer>hash = new HashMap<Character, Integer>();
		for(int i=0;i<word.length();i++)
		{
			char ch = word.charAt(i);
			if(hash.containsKey(ch))
			{
				hash.put(ch, hash.get(ch)+1);
			}
			else
			{
				hash.put(ch, 1);
			}
			
			
		}System.out.println(hash);

	}

	
	public void copyArray()
	{
		String[] num = {"Ram", "Mohan", "Sohan", "Sita", "Gita","Mita"};
		String[] copyNum = new String[6];
		
		for(int i=0;i<num.length;i++)
		{
			copyNum[i]=num[i];
		}
		
		for(int i=0;i<copyNum.length;i++)
		{
			System.out.println(copyNum[i]);
		}
					
	}
	
	
	public void convertArrayToList()
	{
		String[] name = {"Ram", "Mohan", "Sohan", "Sita", "Gita","Mita"};
		Set<String> listNames = new TreeSet<String>();
		for(int i=0;i<name.length;i++)
		{
			listNames.add(name[i]);
		}
		
		System.out.println(listNames);

		
	}
	
	
	public static void main(String[] args) {
		JavaPracTuesday obj = new JavaPracTuesday();
		//obj.revText("I am Santosh");
		//obj.countWord("I like to play music I mean good music at Night");
		//obj.countOccurance("thisisatest!@#$%");
		//obj.copyArray();
		obj.convertArrayToList();
		
	}
	
	
}

