package collectionFramework.listInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListMethods {
	
	public List<String> li = new LinkedList<String>();
	
	String names;
	
	public void convertList()
	{
		li.add("Santosh");
		li.add("SohanLal");
		
		for(String l: li)
		{
			
		names = li.toString();
					
		}
		System.out.println(names);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Santosh");
		names.add("Ankita");
		names.add("Atharv");
		names.add("Sam");
		
		List<String>newList = new ArrayList<String>();
		
		System.out.println(names);
		
		names.addFirst("Saanchi");
	
		
		names.add(2, "Sumit");
		
		System.out.println(names);
		
		names.sort(null);
					
		System.out.println(names);
		System.out.println(names.getLast());
		
		newList.addAll(names);
		newList.removeAll(newList);
		newList.add("test");
		Object[] ob = names.toArray();
		System.out.println(newList);
		
		for(Object nobj:ob)
		{
			System.out.print(nobj);	
		}

		ArrayListMethods obj = new ArrayListMethods();
		obj.convertList();
	}

	
}
