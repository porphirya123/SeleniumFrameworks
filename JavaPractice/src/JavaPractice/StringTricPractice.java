package JavaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StringTricPractice {
	
	
	public void revString(String text)
	{
		
		for(int i=text.length()-1;i>=0;i--)
		{
			System.out.print(text.charAt(i));
			
		}System.out.println();
	}

	public void revSen(String sen)
	{
		
		String[] newSen = sen.split(" ");
		List<String> revSen = new ArrayList<String>();
		for(int i=newSen.length-1;i>=0;i--)
		{
			revSen.add(newSen[i]);
			
		}
		
		for(String s:revSen)
		System.out.print(s+" ");
		
	}
	
	public void findOccurance(String text)
	{
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<text.length();i++)
		{
			char ch = text.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
				
			}else
			{
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		StringTricPractice obj = new StringTricPractice();
		obj.revString("Santosh");
		obj.revSen("I like Java");
		System.out.println();
		obj.findOccurance("I love Javaaa");
		
	}
	

}
