package Week4;

import java.util.Arrays;

import Utilities.Utilities;

public class Friday {
	
	public void sortArray()
	{
		int i = 0;
		int[] arr = Utilities.takeArrInput();
		while(i<arr.length)
		{
			int j= i+1;
			while(j<arr.length)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
				j++;
			}
			
		i++;		
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public void printFibonachi()
	{
		int num = Utilities.takeIntInput();
		int first =0;
		int second = 1;
		int i=2;
		if(num<0) return;
		System.out.print("0 ");
		if(num==0) return;
		System.out.print("1 ");
		while(i<=num)
		{
			int third = first+second;
			first = second;
			second = third;
			System.out.print(third+" ");
			i++;
		}
		
	}
	
	
	public static void main(String[] args) {
		Friday f = new Friday();
		//f.printFibonachi();
		f.sortArray();
	}

}
