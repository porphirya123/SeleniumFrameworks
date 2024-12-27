package JavaConcepts.operators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaBasics {
	
	int num;
	char ch;
	float fl;
	boolean bool;
	long longvalue;
	
	String string;
	int[] arr = new int[3];
	String[] starray = new String[3];
	List<Integer> li = new ArrayList<Integer>();
	
	
	public void defaultValues()
	{
		
		System.out.println("Intger: "+num);
		System.out.println("Character : " +ch);
		System.out.println("Float : " +fl);
		System.out.println("Boolean : "+bool);
		System.out.println("Long : "+longvalue);
		System.out.println("String : "+string);
		System.out.println("Array : " + arr);
		System.out.println("String Array : "+starray);
		System.out.println("ArrayList : "+ li);
		
	}
	
	
	public static void main(String[] args) {
		JavaBasics jb = new JavaBasics();
		jb.defaultValues();
	}
	

}
