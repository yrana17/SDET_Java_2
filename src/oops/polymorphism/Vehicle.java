package oops.polymorphism;

public class Vehicle {

	String color="Black";
	
	
	public void stop()
	{
		System.out.println("Parent stop method......");
	}
	
	
	public Vehicle()
	{
		System.out.println("Default COnstructor for Parent Class");
	}
	
	
	public void start()
	{
		System.out.println("Vehicle Starts........");
	}
	
}
