package trickQuestions.Mathtricks;

public class NestedLoop {
	
	public void printTriangle()
	{
		int num = 4;
		
		for(int i=0;i<num;i++)
		{
			
			for(int j=0;j<num;j++)
				System.out.print(" * ");
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		NestedLoop obj = new NestedLoop();
		obj.printTriangle();
	}

}
