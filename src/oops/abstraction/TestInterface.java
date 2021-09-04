package oops.abstraction;

public class TestInterface implements Interface1 {

	
	public static void main(String[] args) {
		
		TestInterface obj = new TestInterface();
		obj.test();obj.test1();
		obj.display();
		System.out.println(Interface1.rectArea(5, 10));
		
	}
	
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
	System.out.println("Test.......");	
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Test1...........");
	}

	
	
	
}

