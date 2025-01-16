package collectionFramework.listInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayToArrayList {
	
	
	// Arrays.asList - will convert from Array to List
	// toArray(new String[size of list]  - convert from List to Array
	// Arrays.toString(array variable name) - will return each element of an array
	
	
	public static void main(String[] args) {
		
		try {
		
		String[] names = {"Santosh", "Ankita", "Atharv", "Saanchi"};
		List<String>listNames = new ArrayList<String>(Arrays.asList(names));
		System.out.println(listNames);
		
		String[] arrNames = listNames.toArray(new String[listNames.size()]);
		
		System.out.println(Arrays.toString(arrNames));
		
		}catch(NoSuchElementException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	

}
