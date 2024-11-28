package JavaConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collectionframework {
	
	
	public void arrayList(Integer num)
	{
		ArrayList<Integer> array = new ArrayList();
		array.add(10);
		array.add(20);
		array.add(30);
		//System.out.println(array.add(num));
		for(Integer ar:array)
		{
		System.out.println(ar+5);
		}
		
	}
	
	
	public void listcollection()
	{
		List<Integer> lists = new ArrayList<Integer>();
		lists.add(10);
		lists.add(33);
		lists.add(44);
		lists.addLast(20);
		System.out.println(lists);
		
	}
	
	public void setframework()
	{
		Set<Integer> newset = new HashSet<Integer>();
		newset.add(20);
		newset.add(90);
		newset.add(40);
		newset.add(99);
		newset.add(9);
		newset.add(9);
		int size = newset.size();
		System.out.println("Size of Set Values"+size);
		System.out.println(newset);
	}

	
	public void hashset()
	{
		Set<Integer> newset = new TreeSet<Integer>();
		newset.add(20);
		newset.add(90);
		newset.add(40);
		newset.add(99);
		newset.add(9);
		newset.add(9);
		int size = newset.size();
		System.out.println("Size of Set Values"+size);
		System.out.println(newset);
	}
	
	public void hashmap()
	{
		HashMap<String, Integer> newset = new HashMap<String, Integer>();
		newset.put("Santosh", 29);
		newset.put("Ankita", 59);
		newset.put("Santosh", 29);
		newset.put("Atharv", 99);
		newset.put("Pia", 9);
		
	
		int size = newset.size();
		System.out.println("Size of Set Values"+size);
		System.out.println(newset);
		
		if(newset.containsKey("Santosh"))
		{
			System.out.println("The Key value is "+newset.get("Santosh"));
		}
		
	}
	
	
	
	public static void main(String[] args)
	{
		Collectionframework obj = new Collectionframework();
	//	obj.arrayList(50);
		//obj.listcollection();
		//obj.setframework();
		obj.hashmap();
		
		
	}
	
	
	
}
