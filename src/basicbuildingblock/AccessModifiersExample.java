package basicbuildingblock;

public class AccessModifiersExample {
	
	public static void main(String[] args) {
		
		AccessModifiersExample obj = new AccessModifiersExample();
		
		obj.test1();
		obj.test2();
		obj.test3();
		
	}

	public void test1()
	{
		System.out.println("Public Method...........");
	}
	
	private void test2()
	{
		System.out.println("Private Method...........");
	}
	
	protected void test3()
	{
		System.out.println("Protected Method...........");
	}
	
	
	
	
	
	
}
