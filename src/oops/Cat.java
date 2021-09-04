package oops;

public class Cat extends Animal{

	
	public void meow()
	{
		System.out.println("meow.........");
	}
	
	
	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.eat();
		c.meow();
		
	}
	
	
}
