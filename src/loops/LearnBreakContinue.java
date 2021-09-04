package loops;

public class LearnBreakContinue {

	public static void main(String[] args) {

		
		System.out.println("Continue----------");
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				continue;
			else
				System.out.println(i);
		}
		
		System.out.println("Break-----------");
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				break;
			else
				System.out.println(i);
		}
		
		System.out.println("Fibonnaci..............");
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int c;
		for(int i=2; i<=10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
		}
		
	}

}
