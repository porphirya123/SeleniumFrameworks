package trickQuestions.ArrayTricks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Exercise {
	
	public void findMinMax(int[] arr)
	{
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
			else if(arr[i]>max)
			{
				max = arr[i];
			}
		}System.out.println("Min "+ min +" " +"Max " + max);
		
	
		
	}
	
	
	public void Arrayconvert()
	{
		String[] names = {"Santosh", "Ramesh"};
		List<String> list = new ArrayList<>();
		
		Collections.addAll(list, names);
		
		System.out.println(list);
		
	}
	
	
	public void convertArrayToList()
	{
		int[] num = {3,6,8,4};
		
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<num.length;i++)
		{
			list.add(num[i]);
		}
		
		System.out.println(list);
			
	}

	public static void main(String[] args) {
		
		Exercise obj = new Exercise();
		obj.convertArrayToList();
		obj.Arrayconvert();
		int[] arr = {23,4,756,8,5};
		obj.findMinMax(arr);
		
	}

}
