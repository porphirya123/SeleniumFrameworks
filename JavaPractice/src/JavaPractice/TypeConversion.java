package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TypeConversion {
	
	
	public void compareArray()
	{
	String[] firstnames = {"Ankita", "Santosh", "Atharv"};
	String[] lastnames ={"Ankita", "Ankita", "Kumar", "Singh"};

	for(int i=0;i<firstnames.length;i++)
        {
          if(firstnames[i].equals(lastnames[i]))
           {
            System.out.println("True");
           } else 
        	   
           { 
        	   System.out.println("False");
        	}
	
	
            
        }
	}
	
	
	public void arrayToString()
	{
		
		int[] in = {1,23,4,5};
		float[] fl = {2,3,4,5,6};
		char[] ch = {'c', 'd', 'b'};
		
		String instring = Arrays.toString(in);
		String flstring = Arrays.toString(fl);
		String chstring = Arrays.toString(ch);
		
		
		System.out.println(instring);
		System.out.println(flstring);
		System.out.println(chstring);
		
	}
	
	
	public void dataConversion()
	{
		
		int num = 1234;
		char ch = 'c';
		float fl = 23.33f;
		String stringfl = Float.toString(fl);
		String chs = Character.toString(ch);
		String snum = Integer.toString(num);
		System.out.println(snum);
		System.out.println(chs);
		System.out.println(stringfl);
	}
	
	
	public void ArralyListToSet()
	{
		
		List<String> names = new ArrayList<>(); 
		names.add("Ram");
		names.add("Mohan");
		names.add("Sohan");
		
		Set<String> set = new HashSet<>();
		for (String name:names)
		{
			set.add(name);
		}
		
		System.out.println(set);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		TypeConversion obj = new TypeConversion();
		obj.compareArray();
		obj.arrayToString();
		obj.dataConversion();
		obj.ArralyListToSet();
	}
}
