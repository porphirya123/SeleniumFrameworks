package Frameworks;


import java.util.HashMap;

public class CountCharacterInString {
	
	String str= "dsaaf3edfsfas";
	
	HashMap<Character, Integer> map= new HashMap<Character, Integer>();
	
	
	public void countCharacter()
	{
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(map.containsKey(ch))
			{
				int count = map.get(ch);
				count++;
				map.replace(ch, count);
			}
			else
			{
				map.put(ch, 1);
			}
			
			
			
		}for(Character key:map.keySet())
		{
			System.out.println(key + " "+ map.get(key) +" " );
		}
		
		
		
		
	}
	
	public static void main(String[] args)
	{
	
	CountCharacterInString obj = new CountCharacterInString();
	obj.countCharacter();
	}

}
