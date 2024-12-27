package JavaPractice;

public class Recursion {

	
	public static void print(int count)
	{
		if(count==10)
		{
			System.out.println(count);
			return;
		}	
			
			System.out.println(count);
			count++;
			print(count);
			
			
		
	}
	
	
	public static void main(String[] args) {
		
		
		print(1);
		
		
	}
}
