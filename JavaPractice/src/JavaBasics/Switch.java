package JavaBasics;

import java.util.Scanner;

public class Switch {

	
	public void caseTest()
	{
		
		Scanner sc = new Scanner(System.in);
		String day;
		day = sc.nextLine();
		
		
		switch(day)
		{
		case "Monday":
		{
			System.out.println("1st day of the week");
			break;
		}
		
		case "Tuesday":
		{
			System.out.println("2nd day of the week");
			break;
		}
		
		default:
		{
			System.out.println("Rest of the day");
		}
		
		
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Switch obj = new Switch();
		obj.caseTest();
		
	}
	
	
}