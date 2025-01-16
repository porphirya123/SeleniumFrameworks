package collectionFramework.listInterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LinkedListMethods {
	
	int[] nums = {2,3,4,56,3,578,4};
	List<Integer> lroll = new LinkedList<>();
	String[] names = {"Sam", "Rohan"};
	List<String> newroll = new LinkedList<>(Arrays.asList(names));
	
	public void convertArrayToList()
	{
		int[] rolls = new int[2];
		rolls[0] = 23;
		rolls[1] =34;
		
		for(int roll:rolls)
		{
			lroll.add(roll);
		}
		System.out.println(lroll);
		
	}
	
	public void revSen(String sen)
	{
		
		String[] words = sen.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}
		
		
	}
	
	
	public void countOcc(String text)
	{
		
		Map<Character, Integer>map = new HashMap<>();
		
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
	
	
	
	
	public static void main(String[] args) {
		
		LinkedListMethods obj = new LinkedListMethods();
		obj.convertArrayToList();
		System.out.println(obj.newroll);
		obj.revSen("I like Java");
		obj.countOcc("I am going to like java very muchh");
	}
	
}
