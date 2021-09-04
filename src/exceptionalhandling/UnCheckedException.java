package exceptionalhandling;

public class UnCheckedException {
	
	public static void main(String[] args) {
	

		int n1=10;
		int n2=0;
		
		
		try
		{
			System.out.println(n1/n2);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println(n1+n2);
		
		try
		{
		int arr[] = {1,2,3,4};
		for(int i=0;i<=4;i++)
			System.out.println(arr[i]);
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		try
		{
			
			String st=null;
			
			if(st==null || st.isEmpty())
			{
				System.out.println("Its Null");
				st="";
			}
			
			if(st.equals("Test"))
				System.out.println("Pass");
			else
				System.out.println("Fail");
			
		}catch (NullPointerException e) {
			e.printStackTrace();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}

	
	
}
