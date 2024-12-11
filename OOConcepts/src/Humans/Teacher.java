package Humans;

public class Teacher {
	
	Teacher()
	{
		System.out.println("Bydefault we all need a teacher in our life");
	}
	
	public void work()
	{
		System.out.println("Teacher teached as Work");
	}
	
	
	public void salary()
	{
		System.out.println("Teacher gets good Salary");
	}
	
	

	public static void main(String[] args) {
		
		Teacher obj = new StudentA();
		obj.salary();
		
		
	}

}


class StudentA extends Teacher

{

	StudentA()
	{
		System.out.println("Bydefault stduents follow teacher");
	}
	
	public void stWork()
	{
		System.out.println("StudentA studies");
	}
	
	public void stFood()
	{
		System.out.println("StudentA eats in Cafeteria");
	}
	
	
	
	public void salary()
	{
		System.out.println("Once Student grows up Students gets good Salary too");
	}
	
	
}

