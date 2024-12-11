package DailyPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class DayOne {
	
	
	public void revString(String text)
	{
		
		for(int i=text.length()-1;i>=0;i--)
		{
			System.out.println(text.charAt(i));
		}
		
		
	}
	
	
	public void occurance(String text)
	{
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		
		for(int i=0;i<text.length();i++)
		{
			char ch = text.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}System.out.println(map);
		
	}
	
	
	public void countWords(String sentence)
	{
		String[] words = sentence.split(" ");
		System.out.println(words.length);
	}
	
	
	public void copyArray()
	{
	String names[]= {"Santosh", "Rohit", "Mohit"};
	String newArray[] = new String[3];
	
	for(int i=0;i<names.length;i++)
	{
		newArray[i]= names[i];
	}
	
	for(String name: newArray)
	{
		System.out.println(name);
	}
	
	}
	
	
	public void ArrayToList()
	{
		String names[]= {"Santosh", "Rohit", "Mohit"};
		List<String> listnames = new LinkedList<String>();
		listnames = Arrays.asList(names);
		System.out.println(listnames);
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		DayOne obj = new DayOne();
		obj.ArrayToList();
		obj.copyArray();
		obj.countWords("I want to play in the ground");
		obj.occurance("This is Santosh");
		obj.revString("Tellme First");
	}
	
	

}
