package exceptionalhandling;

public class Throw {

	public static void main(String[] args) {
		
		int age=15;
		try
		{
		if(age<18)
			throw new CustomException("Not ELigible for Driving");
		else
			System.out.println("Good to go.....");	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
