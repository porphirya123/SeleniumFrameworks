package JavaOOPs;


class Animal
{
	
	public void nature()
	{
		System.out.println("This is vegetarian");
	}
	
	
}


class Dog extends Animal
{
	
	public Dog()
	{
		super();
		System.out.println("This Animal is vegetarian");
	}
	
	
	public void sound()
	{
		System.out.println("Dog Barks");
	}
	
	public void nature()
	{
		System.out.println("This is non vegeterian as well");
	}
	
	
}


class Cat extends Dog
{
	
	public Cat()
	{
		super();
	}
	
	
	public void sound()
	{
		
		System.out.println("Cat sounds like Miaun");
	}
}


public class MethodOverriding {
	
	public static void main(String[] args) {
		
		Animal n = new Dog();
		n.nature();
		
		Dog d = new Dog();
		d.nature();
		
		Cat c = new Cat();
		c.sound();
		
		
	}
	

}
