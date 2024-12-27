package JavaConcepts.String;

import java.util.HashMap;

public class PracticeSetDayOne {
	
	/*
	 * Reverse a word/Sentence
	 * Count total no of words in a sentence
	 * Reverse words in a sentence
	 * Count Occurance in a word or sentence
	 * Check if letter is vowel or consonant
	 * Convert integer to String
	 * 
	 */
	
	String text = "avaStringractice";
	String sen = "I like Java and I enjoying coding in Java";
	char revText;
	
	public void revString()
	{
		
		for(int i=text.length()-1;i>=0;i--)
		{
			System.out.print(revText = text.charAt(i));
		}
	}
	
	
	
	public void countWords()
	{
		
		String[] words = sen.split(" ");
		System.out.println();
		System.out.println(words.length);
	}


	public void revWords()
	{
		
		String[] words = sen.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+ " ");
		}
		
	}
	
	
	public void countOccurance()
	{
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<=sen.length()-1;i++)
		{
			char ch = sen.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}else 
			{
				map.put(ch, 1);
			}
		}System.out.println(map);
	}
	
	public void checkVowel()
	{
		HashMap<Character, Integer> map = new HashMap<>();
		int count = 0;
		for(int i=0;i<text.length()-1;i++)
		{
			char ch = text.charAt(i);
			if(ch=='a'|| ch== 'i' || ch =='e' || ch == 'o' || ch == 'u')
			{
				count ++;
				System.out.println("Character : " +ch );
			}
				
			
		}System.out.println("Total vowels in this text = " + count);
	}
	
	
	public void intToString()
	{
		int num = 23232;
		
		String stnum = String.valueOf(num);
		System.out.println(stnum);
		
		
		
	}
	
	public static void main(String[] args) {
		PracticeSetDayOne obj = new PracticeSetDayOne();
		obj.revString();
		obj.countWords();
		obj.revWords();
		obj.countOccurance();
		obj.checkVowel();
		obj.intToString();
	}

}
