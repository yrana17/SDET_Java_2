package basicbuildingblock;

public class LearnConstructors {

	int x1;
	int x2;
	
	public LearnConstructors()
	{
		System.out.println("This is my default constructor.");
	}

	public LearnConstructors(int a, int b)
	{
		x1=a;
		x2=b;
	}
	
	public void display()
	{
		System.out.println(x1+x2);
		System.out.println("Test Display");
	}
	
	public static void main(String[] args) {	
		LearnConstructors learnConstructors = new LearnConstructors(10,15);
		learnConstructors.display();
		
		
	}
	
	
	
}
