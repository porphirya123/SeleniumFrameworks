package JavaConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


public class CollectionFramework2 {
	
	public void listmethod()
	{
	List<Integer>list = new ArrayList();
	list.add(10);
	list.add(20);
	list.add(10);
	list.add(30);
	
	list.addFirst(90);
	list.addLast(100);
	
	
	System.out.println(list);
	System.out.println(list.lastIndexOf(10));
	}
	
	
	
	public void linkedList()
	{
		Set<String> list = new HashSet<String>();

        // Adding elements to the LinkedList using add() method
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        // Printing the LinkedList
        System.out.println(list);
    }
		
		
	
	
	public void Mapmethod()
	{
		Map<String, Integer>map = new HashMap();
		map.put("Santosh", 40);
		map.put("Ankita", 35);
		System.out.println(map);
		
	}
	
	
	public static void main(String[] args)
	{
		CollectionFramework2 obj = new CollectionFramework2();
		obj.listmethod();
		obj.Mapmethod();
		
	}
	

}
