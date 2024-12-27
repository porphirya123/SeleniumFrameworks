package JavaConcepts.String;

import java.util.HashMap;

public class Practice {
	
	
	public void occuranceCount(String text)
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
	
	public void revText(String word)
	{
		for(int i=word.length()-1;i>=0;i--)
		{
			System.out.print(word.charAt(i));
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Practice obj = new Practice();
		//obj.occuranceCount("Atharv and Pia like to play downstairs and");
		obj.revText("vrahtA");
	}
	

}
