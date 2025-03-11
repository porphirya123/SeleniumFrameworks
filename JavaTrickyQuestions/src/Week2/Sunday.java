package Week2;

import java.util.Arrays;

import Utilities.Utilities;

public class Sunday {
	
	public void sortArrayDec()
	{
		
		int[] arr = Utilities.takeArrInput();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}System.out.println(Arrays.toString(arr));
		
		
	}
	
	public void sortArray()
	{
		int[] arr = Utilities.takeArrInput();
		int i=0;
		int j=0;
		while(i<arr.length)
		{
			j=i+1;
			while(j<arr.length)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
				j++;
			}
			
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void getMax()
	{
		
		int[] arr = Utilities.takeArrInput();
		int i=1;
		int max = arr[0];
		while(i<arr.length)
		{
			if(max<arr[i])
			{
				max = arr[i]; 
			}
			i++;
		}System.out.println("Maximium Element = "+max);
		
	}
	
	
	public void getMin()
	{
		
		int[] arr = Utilities.takeArrInput();
		int i=1;
		int min= arr[0];
		while(i<arr.length)
		{
			
			if(min>arr[i])
			{
				min=arr[i];
			}
			i++;
		}System.out.println(min);
		
		
	}
	
	public void revArray()
	{
		int[] arr = Utilities.takeArrInput();
		int i= arr.length-1;
		int j=0;
		int[] newarr = new int[arr.length];
		while(i>=0)
		{
			newarr[j] = arr[i]; 
			i--;
			j++;
		}
		System.out.println(Arrays.toString(newarr));
		
	}

	public void sumOfAllElements()
	{
		
		int[] arr = Utilities.takeArrInput();
		int i = 0;
		int sum =0;
		while(i<arr.length)
		{
			sum+=arr[i];
			i++;
		}
		System.out.println("Sum of all Elements "+sum);
		
	}
	
	
	public static void main(String[] args) {
		Sunday s = new Sunday();
		//s.sumOfAllElements();
		//s.revArray();
		//s.getMin();
		//s.getMax();
		//s.sortArray();
		s.sortArrayDec();
	}
	
}
