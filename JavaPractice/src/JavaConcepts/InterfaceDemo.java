package JavaConcepts;

public interface InterfaceDemo {
	
	void demo();
	void demo1();
	default void demo3()
	{
		System.out.println("test");
	}

}
