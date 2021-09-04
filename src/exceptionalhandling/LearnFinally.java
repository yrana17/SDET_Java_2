package exceptionalhandling;

public class LearnFinally {

	
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println("Try");
			System.out.println(10/0);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally");
		}
		
		
		try
		{
			
		}finally {
			
		}
		
		
		
		
	}
	
	
}
