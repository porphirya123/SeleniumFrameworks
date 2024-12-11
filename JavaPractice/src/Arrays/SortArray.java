package Arrays;

public class SortArray {
	
	public void sortAr()
	{
	int[] nums = {5,2,4,6,3,9};
	int temp;
	int size = nums.length;
	
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size-i-1;j++)
		{
			if(nums[j]>nums[j+1])
			{

				temp = nums[j];
				nums[j] = nums[j+1];
				nums[j+1] = temp;
			}
		}
		System.out.println();
		for(int num:nums)
		{
			System.out.print(num +" ");
		}
	}System.out.println();
	
	}
	
	
	public void minMax(int[] arr)
	{
		if(arr==null || arr.length==0)return;
		
		int Min = arr[0];
		int Max = arr[0];
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<Min)
			{
				Min = arr[i];
			}
			else if(arr[i]>Max)
			{
				Max = arr[i];
			}
		}
		
		System.out.println("Minimum = "+Min);
		System.out.println("Maximum = "+Max);
		
	}

	
	public void arrSum(int[] arr)
	{
		if(arr==null || arr.length==0)return;
		
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum= sum+arr[i];
		}
		System.out.println("The Sum of Array is = " +sum);
		
		
	}
	
	
	
	public static void main(String[] args) {
		SortArray obj = new SortArray();
		obj.sortAr();
		int[] array = {20,3,6,7,89,5};
		obj.minMax(array);
		obj.arrSum(array);
	}

}
