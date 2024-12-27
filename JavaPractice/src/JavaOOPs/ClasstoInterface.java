package JavaOOPs;

public interface ClasstoInterface {
	
	int age =20;
	int rollno = 10;
	
	
	public void setup();
	void print();
	
	default void test()
	{
		System.out.println("Print non abstract method of Interface");
	}
	
	
}

class A implements ClasstoInterface
{

	@Override
	public void setup() {
		
		System.out.println("Setup Method");
		
	}

	@Override
	public void print() {
		System.out.println("print method");
		
	}

	public static void main(String[] args) {
		A obj = new A();
		obj.print();
		obj.setup();
		obj.test();
	}
	
	
}
