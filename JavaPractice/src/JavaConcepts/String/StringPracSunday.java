package JavaConcepts.String;

import java.util.HashMap;

public class StringPracSunday {
	
	String text = "errrrr2dsfa@2#WE#$^&EEFDFHSAadfasf";
	String sen = " I like to code in Java";
	HashMap<Character, Integer> map = new HashMap<>();
	
	public void countChar()
	{
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
			
		}
		System.out.println(map);
	}

	
	public void revtext()
	{
		for(int i=text.length()-1;i>=0;i--)
		{
			System.out.print(text.charAt(i));
		}
	}
	
	
	public void countWord()
	{
		String[] str = sen.split(" ");
		
		System.out.println(str.length);
		
		
	}
	
	
	
	public static void main(String[] args) {
		StringPracSunday obj = new StringPracSunday();
//		obj.countChar();
//		obj.revtext();
		obj.countWord();
	}
	
	
	

}
