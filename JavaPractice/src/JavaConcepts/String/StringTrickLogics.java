package JavaConcepts.String;

import java.util.Scanner;

public class StringTrickLogics {

	
	/******** Find count of words in a Sentence *********/
	
	public void countWord()
	{
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();
		int count = 1;
		for(int i=0;i<sen.length();i++)
		{
			if((sen.charAt(i)==' ') && (sen.charAt(i+1)!=' ')) // checking the condition that after word there should be space and after space there should be a character
					{
					count++;
					}
		}System.out.println("No of words = "+count);
		
    	}
	

	/******** Find count of words in a Sentence *********/
	
	public void countW()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice ");
		String word = sc.nextLine();
		
		String[] onlyword = word.split(" ");
		System.out.println(onlyword.length);
		
	}
	
	/******** Reverse the character *********/
	
	public void revChar()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a workd ");
		
		String word = sc.nextLine();
		String rev = "";
		
		
		for(int i=word.length()-1;i>=0;i--)
		{
			char ch=word.charAt(i);
			//rev = rev+ch;
			System.out.print(ch);
		}
	//	System.out.println(rev);
	}
	
	/******** Reverse the Sentence words *********/
	
	public void revSentence()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a choice ");
		String sen = sc.nextLine();
		String reversedSen = "";
		
		String[] revSen = sen.split(" ");
		for(int i=revSen.length-1;i>=0;i--)
		{
			reversedSen = revSen[i]+" ";
			System.out.println(reversedSen);
		}
	}
	
	/******** Check split method*********/
	public void checkSplit()
	{
		String name = "I Like Java";
		String[] newName = name.split("L");
		for(int i=0;i<newName.length;i++)
		{
		String tostringVal = newName[i];
		System.out.print(tostringVal);
		}
	}
	
	
	public void compareTwoString()
	{
		String firstStr = "Good";
		String secondStr = "Good";
		
		boolean istrue =false;
		
		for(int i=0;i<firstStr.length()-1;i++)
		{
			if(firstStr.charAt(i)!=secondStr.charAt(i))
			{
				istrue = false;
				break;
			}
			istrue = true;
			}System.out.println(istrue);
	}
	
	public void compareStrMethod()
	{
		
		StringBuilder firstStr = new StringBuilder();
		StringBuilder secondStr = new StringBuilder();
		
		firstStr.append("Good");
		secondStr.append("Good");
		
		String name1 = new String("Santosh");
		String name2 = new String("Santosh");
		
		System.out.println(name1.equalsIgnoreCase(name2)); // Method 1
		System.out.println(name1.equals(name2)); // Method 2
		System.out.println(name1.compareTo(name2)); // Method 3
		System.out.println(name1.equalsIgnoreCase(name2)); // Method 4
		
		//System.out.println(firstStr.compareTo(secondStr));
		
		
	}
	
	
	public static void main(String[] args)
	{
	StringTrickLogics obj = new StringTrickLogics();
//	obj.revChar();
//	obj.countW();
	//obj.revSentence();
	//obj.revChar();
	//obj.checkSplit();
	//obj.compareTwoString();
	obj.compareStrMethod();
	}
	
	
}
