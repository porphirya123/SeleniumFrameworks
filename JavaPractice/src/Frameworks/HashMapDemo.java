package Frameworks;

import java.util.HashMap;

public class HashMapDemo {
	
	HashMap<String, Integer> map = new HashMap<>();
	
	
	public void hashmap()
	{
		
		map.put("Santosh", 1);
		map.put("Demo", 2);
		map.put("Ankita", 3);
		map.put("Ravi", 4);
				
		System.out.println(map);
		
		System.out.println(map.containsValue("Ravi"));
		System.out.println(map.containsKey("Ravi"));
		
		System.out.println(map.get("Santosh"));
		
		
	}
	
	
	public static void main(String[] args) {
		
		HashMapDemo obj = new HashMapDemo();
		obj.hashmap();
		
		
	}
	
	
	

}
