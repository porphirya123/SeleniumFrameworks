package JavaOOPs;


class Shape
{
	
	protected int shapeNum;
	
	public Shape(int shapeNum)
	{
		
		this.shapeNum = shapeNum;
		
		System.out.println("This is shapeNum in Shape Class : "+shapeNum);
		System.out.println("This is this.shapeNum in Shape Class : "+this.shapeNum);
	}
	
}


class Square extends Shape
{
	
protected int squareNum;
	
	public Square(int squareNum)
	{
		
		super(squareNum);
		
		System.out.println("This is shapeNum in Shape Class : "+squareNum);
		
	}
	
	public void getSquare(int num)
	{
		System.out.println(num*num);
	}
	}


public class Constructor {
	
	public static void main(String[] args) {
	
		Square s = new Square(4);
		s.getSquare(5);
	}

	
	
	
	
	
}
