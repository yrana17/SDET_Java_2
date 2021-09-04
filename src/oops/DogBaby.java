 package oops;

public class DogBaby extends Dog{

	
	public void sleep()
	{
		System.out.println("Baby Dog is Sleeping.........");
	}
	
	
	public static void main(String[] args) {
		
		DogBaby obj = new DogBaby();
		obj.eat();
		obj.bark();
		obj.sleep();
		
	}
	
	
}
