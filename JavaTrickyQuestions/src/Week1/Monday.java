package Week1;

import java.util.Arrays;

import Utilities.Utilities;



public class Monday {
	
	public void getLCM()
	{
		
		int num1 = Utilities.takeIntInput();
		int num2 = Utilities.takeIntInput();
		
		int lcm = 0;
		int i=2;
		while(i<=num1*num2)
		{
			if(i%num1==0 && i%num2==0)
			{
				lcm = i;
				break;
			}
			i++;
		}
		System.out.println("LCM is "+lcm);
		
	}
	public void sumOfAllDigits()
	{
		int num = Utilities.takeIntInput();
		int sum = 0;
		
		while(num!=0)
		{
			sum+= num%10;
			num /=10;
			
		}
		System.out.println("Sum of all Digits :" +sum);
	}
	
	public void getFactorial()
	{
		int i=1;
		long fact=1;
		int num = Utilities.takeIntInput();
		while(i<=num)
		{
			fact*=i;
			i++;
		}
		System.out.println(fact);
		
	}
	public void getFibonachi()
	{
		int first =0;
		int second =1;
		int i=2;
		int num = Utilities.takeIntInput();
		if(num<0) return;
		System.out.print("0 ");
		if(num==0) return;
		System.out.print("1 ");
		while(i<=num)
		{
			int temp = first+second;
			first = second;
			second = temp;
			System.out.print(temp+" ");
			
			i++;
		}
		
	}
	
	public void revArray()
	{
		
		int[] arr = Utilities.takeArrInput();
		int i=arr.length-1;
		int j=0;
		int[] revarr = new int[arr.length];
		
		while(i>=0)
		{
			
			revarr[j]=arr[i];
			j++;
			i--;
		}
		
		System.out.println(Arrays.toString(revarr));
		
		
	}
	
	public void deleteElement()
	{
		
		int[] arr = Utilities.takeArrInput();
		int num = Utilities.takeIntInput();
		int occ;
		int[] newarr = new int[(arr.length)-1];
		int i=0;
		int j=0;
		while(i<arr.length)
		{
			
			if(arr[i]!=num)
			{
				newarr[j] = arr[i];
				
				j++;
			}
			i++;
			
		}
		System.out.println(Arrays.toString(newarr));
		
	}
	
	public static void main(String[] args) {
		
		Monday obj = new Monday();
		//obj.deleteElement();
		//obj.revArray();
		//obj.getFibonachi();
		//obj.getFactorial();
		//obj.sumOfAllDigits();
		obj.getLCM();
	}
	

}
