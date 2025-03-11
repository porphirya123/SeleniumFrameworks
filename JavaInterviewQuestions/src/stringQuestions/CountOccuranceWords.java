package stringQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceWords {
	
	public static void countWords(String text)
	{
		String[] newtext = text.split(" ");
		int i=0;
		Map<String, Integer> map = new HashMap<>();
		while(i<newtext.length)
		{
			String temp = newtext[i];
			if(map.containsKey(temp))
			{
				map.put(temp, map.get(temp)+1);
			}else
			{
				map.put(temp, 1);
			}
			i++;
		}System.out.println(map);
		
		
	}
	
	public static void main(String[] args) {
		
		countWords("I Love Java and I love Java and you like Java too");
		
		
	}

}
