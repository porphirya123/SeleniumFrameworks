package JavaConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CollectionPractice {
	
	
	List<Integer> li = new ArrayList<Integer>();
	Set<Integer> set = new HashSet<Integer>();
	
	public void convertSetToList()
	{
	
		int size = set.size();
		li = new ArrayList<>(size);
		System.out.println(li);
		
	}
	
	
	
	public void checkList()
	{
		
		List<Integer>rollno = new ArrayList<Integer>();
		
		rollno.add(10);
		rollno.add(5);
		rollno.add(10);
		rollno.add(20);
		
		System.out.println(rollno);
		
		
			
		
		
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		CollectionPractice obj = new CollectionPractice();
		//obj.checkList();
		obj.convertSetToList();
	}
	
	
}
