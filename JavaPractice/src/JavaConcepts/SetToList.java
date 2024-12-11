package JavaConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList {
	

	
		public void convertSetToList()
		{
		
			Set<String>demo = new HashSet();
			demo.add("Santosh");
			demo.add("Ankita");
			demo.add("Duggu");
			
			//int size = demo.size();
			
			
			
			List<String>list = new ArrayList();
			
			for(String st:demo)
			{
				list.add(st);
			}
			
			System.out.println(list);
			
			
		}
	
public static void main(String[] args) {
	
	SetToList obj = new SetToList();
	obj.convertSetToList();
	
}

}
