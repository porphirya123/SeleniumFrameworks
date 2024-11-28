package JavaConcepts;

public class StringPractice {
	
	
	public void stringrev()
	{
		String name = "Santosh";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
		
	}
	
	public void mutablestring()
	{
		StringBuilder str = new StringBuilder("Santosh");
		System.out.println(str.reverse());
		
	}
	
	
	/*Print 1 to 10 without using for loop*/
	public void printOnetoTen(int num)
	{
	if(num<=10)
	{
		System.out.println(num);
		printOnetoTen(num+1);
		
		
	}
}
	
	
	public static void main(String[] args)
	{
		StringPractice obj = new StringPractice();
		//obj.stringrev();
		//obj.mutablestring();
		obj.printOnetoTen(1);
		
		
		
	}

}
