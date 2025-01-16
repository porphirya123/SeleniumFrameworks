package collectionFramework.HashInterface;

import java.util.HashMap;

public class HashMapMethods {
	
	
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	
	public void checkHashMapMethods()
	{
		
		map.put('c', 1);
		map.put('s', 3);
		
		System.out.println(map);
	}
	
	
	public static void main(String[] args)
	{
		HashMapMethods obj = new HashMapMethods();
		obj.checkHashMapMethods();
	}
	

}
