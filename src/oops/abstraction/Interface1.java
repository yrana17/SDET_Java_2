package oops.abstraction;

public interface Interface1 {

	void test();	
	void test1();
	
	default void display()
	{
		System.out.println("Default Method Display........");
	}
	
	
	static int rectArea(int x,int y)
	{
		return x*y;
	}
}
