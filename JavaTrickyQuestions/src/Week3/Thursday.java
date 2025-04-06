package Week3;

import java.util.HashMap;
import java.util.Map;

import Utilities.Utilities;

public class Thursday {
	
	public void notRepeatedChar()
	{
		String txt = Utilities.takeString();
		int i=0;
		char ch=' ';
		
		while(i<txt.length())
		{
			boolean found = false;
			int j=i+1;
			while(j<txt.length())
			{
				if(txt.charAt(i)==txt.charAt(j))
				{
					found = true;
				}
				j++;
				
			}
			
			if(found==false)
			{
				System.out.println(txt.charAt(i));
				break;
			}
				
			i++;
			
		}
		
		
	}
	
	public boolean isEqual()
	{
		String first = Utilities.takeString();
		String second= Utilities.takeString();
		int i=0;
		while(i<first.length())
		{
			if(first.charAt(i)!=second.charAt(i))
			{
				return false;
			}
			i++;
		}
		return true;
		
	}
	
	public void revWords()
	{
		String txt = Utilities.takeString();
		String[] newTxt = txt.split(" ");
		int i=newTxt.length-1;
		while(i>=0)
		{
			System.out.print(newTxt[i]+" ");
			i--;
		}
		
	}
	
	public void getOccurance()
	{
		String txt = Utilities.takeString();
		
		Map<Character, Integer> map = new HashMap<>();
		int i=0;
		while(i<txt.length())
		{
			char ch;
			if(txt.charAt(i)!=' ');
			{
				ch = txt.charAt(i);
				if(map.containsKey(ch))
				{
					map.put(ch, map.get(ch)+1);
				}
				else
				{
					map.put(ch, 1);
				}
			}
			
		
			i++;
		}System.out.println(map);
		
	}
	
	public void changeFirstNameWay2()
	{
		String name = Utilities.takeString();
		String[] txt = name.split(" ");
		int i=0;
		String newName = "";
					
		while(i<txt.length-1)
		{
			
			System.out.print(txt[i].charAt(0)+". ");
			i++;
		}
	System.out.println(txt[txt.length-1]);
		
		
	}
	
	public void changeFirstName()
	{
		String name = Utilities.takeString();
		String[] txt = name.split(" ");
		int i=0;
		String newName = "";
		
		//System.out.println(txt.length-1);
		
		while(i<txt.length)
		{
			if(i==txt.length-1)
			{
				newName += " "+txt[i];
				
			}else
			{
				newName +=txt[i].charAt(0)+". ";
				
			}
			i++;
		}
	System.out.println(newName);
		
		
	}
	
	public static void main(String[] args) {
		Thursday t = new Thursday();
		//t.changeFirstNameWay2();
		//t.getOccurance();
		//t.revWords();
		//System.out.println(t.isEqual());
		t.notRepeatedChar();
	}

}
