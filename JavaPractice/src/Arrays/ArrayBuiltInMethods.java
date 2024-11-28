package Arrays;

import java.util.Arrays;

public class ArrayBuiltInMethods {
	
	
	public static void main(String[] args) {
		
		int rolls[] = {12,33,44,22,53};
		int ages[] = new int[4];
		ages[0] = 10;
		ages[1] = 1;
		ages[2] = 13;
		ages[3]= 44;
		
		
		String[] firstnames = {"Ankita", "Santosh", "Atharv", "Saanchi"};
		String[] lastnames ={"Aggarwal", "Ankita", "Kumar", "Singh"};
		System.out.println(Arrays.compare(rolls, ages));
		System.out.println(Arrays.compare(firstnames, lastnames));  /*Comparing 2 arrays*/
		
		

		
		
		System.out.println("Comparing 2 Arrays : " +Arrays.compare(firstnames, lastnames)); 
		System.out.println("The Result after converting Array to String : " + Arrays.asList(firstnames));  /* asList change from simple Array to ArrayList of Collection framework*/
		
		
		
		
		
		
		
	}

}