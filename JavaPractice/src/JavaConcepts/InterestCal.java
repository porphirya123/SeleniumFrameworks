package JavaConcepts;

import java.util.Scanner;

public class InterestCal {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal Amount : ");
		int principal = sc.nextInt();
		
		System.out.println("Enter interest factor : ");
		int roi = sc.nextInt();
		
		System.out.println("Enter No of Years : ");
		int years = sc.nextInt();
		
		int simpleInterest = (principal*roi*years)/100;
		System.out.println("Your Maturity Interest will be : "+simpleInterest);
		
		
	}
	

}
