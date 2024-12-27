package trickQuestion.StringTrick;

import java.util.HashMap;

public class Excercise {
	
	
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
				
			
			
		}System.out.println(map);
		
		
		
	}
	
	
	public void revWord(String text)
	{
		
		for(int i=text.length()-1;i>=0;i--)
		{
			System.out.print(text.charAt(i));
		}
	}

	
	public void revSen(String sen)
	{
		String[] words = sen.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+ " ");
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		Excercise obj = new Excercise();
		obj.revWord("Santosh");
		obj.revSen("I like Java");
		obj.findOccurance("This is Test");
	}
	
}
