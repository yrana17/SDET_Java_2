package oops.abstraction;

public class TestMultiplInheritance implements I1,I2{

	
	
	public static void main(String[] args) {
		
		TestMultiplInheritance obj = new TestMultiplInheritance();
		obj.display();
	}

	@Override
	public void display() {
	
		System.out.println("Display as per your requirement......");
	}
	
}
