package StringTrickQuestions;

import java.util.HashMap;

public class FindOccurance {
	
	public static String name = "wrwewrqrwetyytdfgds";
		
	public void findCount()
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<name.length()-1;i++)
		{
			char c = name.charAt(i);
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}else
			{
				map.put(c, 1);
			}
			
		}System.out.println(map);
	}
	
	public static void main(String[] args) {
		
		FindOccurance obj = new FindOccurance();
		obj.findCount();
		
		
	}


}