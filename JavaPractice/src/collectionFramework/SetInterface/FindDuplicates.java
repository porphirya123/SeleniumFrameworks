package collectionFramework.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	
	
	public static void main(String[] args) {
		
		Set<Character>set = new HashSet<Character>();
		String text = "hello World";
	
		int count =0;
		for(int i=0;i<text.length();i++)
		{
			
			if(!set.add(text.charAt(i)))
			{
				System.out.println("Duplicate character = "+text.charAt(i));
				System.out.println("Duplicate character index = "+i);
				count++;
			}
			
			
		}System.out.println("Total Duplicate character: "+count);
		
		
		
	}
	
}
