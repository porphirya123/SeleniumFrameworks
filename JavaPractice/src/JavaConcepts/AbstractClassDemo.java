package JavaConcepts;

public class AbstractClassDemo extends DemoTest{

	public void printmethod() {

		System.out.println("Print Abstract Class Method");
	}

	public void sum() {
		
		int a=20;
		int b=40;
		System.out.println("Sum = "+(a+b));
	}
	
	public static void main(String[] args)
	{
		AbstractClassDemo obj = new AbstractClassDemo();
		obj.printmethod();
		obj.sum();
		obj.testmethod();
		
	}

}


abstract class DemoTest
{

	 abstract void printmethod();
	
	 abstract void sum();
	
	 public void testmethod()
	 {
		 System.out.println("Printing non Abstract Method inside Abstract Class");
	 }
	
}

class Call extends DemoTest
{

	@Override
	void printmethod() {
		System.out.println("2nd Time Abastract Class Called");
	}

	@Override
	void sum() {
		
		int b=23;
		int c = 23;
		System.out.println(b+c);
		
	}
	
}

