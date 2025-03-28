package trickQuestions.ArrayTricks;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
	
	
	public void arraymethods()
	{
		int[] rolls = new int[5];
		rolls[0]=5;
		rolls[1]=4;
		rolls[2]=20;
		rolls[3]=8;
		
		/*********copy 1 array to another *********************/
		int[] rollnums = Arrays.copyOf(rolls, rolls.length);
		int[] names = new int[rolls.length];
		names = rolls;
		for(int n:names)
		{
			System.out.println("Values for Copied Array = "+n);
		}
		
		/**************************************************/
			
		/******************Array Sorting*******************************/
		Arrays.sort(rolls);
		
		for(int roll:rolls)
		{
			System.out.println(roll);
		}
		
		/**************************************************/

		
		/**************Setting up default values************************************/

		Arrays.fill(rollnums, 100);
		for(int r:rollnums)
		{
			System.out.println(r);
		}
		
		
		System.out.println(Arrays.equals(rolls, rollnums));
		
		
		/**************************************************/

		
		
		
		
		
		
		
	}
	
	
	public void method1()
	{
		System.out.println("Method1");
	}
	
	public void method2()
	{
		System.out.println("Method2");
	}
	
	
	public static void main(String[] args) {
		
		String[] names = {"Ram","Sita","Laxman"};
		
		/*************Converting array to List************************************/

		List<String> newnames = Arrays.asList(names);
		
		
		for(String l:newnames)
		{
			System.out.println(l);	
		}
		
		
		
		ArrayDemo obj = new ArrayDemo();
		obj.arraymethods();
		
		
		Method[] methods = obj.getClass().getMethods();
		for(Method method:methods)
		{
			System.out.println(method);
		}
		
			
		
		
		
	}

}
