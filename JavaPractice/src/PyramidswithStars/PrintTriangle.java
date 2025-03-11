package PyramidswithStars;

public class PrintTriangle {
	
	public static void printTriangle()
	{
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void printTriangleUpsideDown()
	{
		
		for(int i=10;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		
		printTriangleUpsideDown();
		printTriangle();
	

}
}