package exceptionHandling;

public class ExceptionHandling {
	
	
	public static int i = 10;
	public static int j = 0;
	public static String name = null;
	public static int[] num = new int[4];
	
	
	

	public static void main(String[] args) {
	
		try
		{
			System.out.println(i/j);
			System.out.println(num[3]);
			System.out.println(num[0]);
			System.out.println(name.length());
			
		}catch(ArithmeticException e)
		{
			System.out.println("Calculation failed" + e);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Defined array is out of bound" + e);
		}
		
		catch(Exception e)
		{
			System.out.println("Something went wrong"+e);
		}
		
		
		
		
		
		
		
		
		
	}

}
