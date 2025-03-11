package Week1;

import java.util.Arrays;

import Utilities.Utilities;

public class JavaThursday {
	
	
	
	public void getFibonachi()
	{
		int num = Utilities.takeIntInput();
		int i=2;
		int first = 0;
		int second = 1;
		
		if(num<0) return;
		System.out.print("0 ");
		if(num==0) return;
		System.out.print("1 ");
		
		while(i<=num)
		{
			int third = first+second;
			first = second;
			second = third;
			System.out.print(third+ " ");
			i++;
		}
		
		
	}
	
	public void sortArr()
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
					arr[j]= temp;
					
				}
				j++;
				
			}i++;
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		JavaThursday obj = new JavaThursday();
		//obj.sortArr();
		obj.getFibonachi();
	}
	
}
