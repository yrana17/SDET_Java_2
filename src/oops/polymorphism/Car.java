package oops.polymorphism;

import oops.Parent;

public class Car extends Vehicle{

	public Car()
	{
		System.out.println("Car class Default Constructor");
	}
	
	String color="Blue";
	public void start()
	{
		System.out.println("Car Starts........");
	}
	public void disp()
	{
		System.out.println("Car Display");
	}
	
	public void displayColor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	
	
	public void stop()
	{
		System.out.println("Child Stop.......");
	}
	
	
	public void method1()
	{
		stop();
		super.stop();
	}
	
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.start();
	
		c.displayColor();
		
		//upcasting as object v has limited access to parent clas onlt
		//LHS is my Refrence class  and right hand side is my object
		/*
		 * Vehicle v = new Car(); v.start();
		 * 
		 * Vehicle v1= new Vehicle(); v1.start();
		 * 
		 */	
	}
	
	
}
