package Week2;

import java.util.Arrays;

import Utilities.Utilities;

public class Wednesday {

	public void sortArray()
	{
		
		int[] arr = Utilities.takeArrInput();
		int i=0;
		while(i<arr.length)
		{
			int j=i+1;
			while(j<arr.length)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
			i++;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void main(String[] args) {
		Wednesday w = new Wednesday();
		w.sortArray();
	}
	
}
