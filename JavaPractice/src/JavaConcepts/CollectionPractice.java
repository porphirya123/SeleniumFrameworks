package JavaConcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CollectionPractice {
	
	
	public void checkList()
	{
		
		List<Integer>rollno = new ArrayList<Integer>();
		
		rollno.add(10);
		rollno.add(5);
		rollno.add(10);
		rollno.add(20);
		
		System.out.println(rollno);
		
		
			
		
		
	}
	
	
	public void Queuedemo()
	{
		Queue<Integer>q = new LinkedList();
		
	}
	
	
	public static void main(String[] args)
	{
		CollectionPractice obj = new CollectionPractice();
		obj.checkList();
	}
	
	
	
	

}
