package conditionalstatements;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n1= -1.0, n2=4.5, n3=-5.3, largest;
		
		int x = 100;

		if (x < 33)
			System.out.println("Fail");
		else if (x >= 33 && x <= 50)
			System.out.println("ALmost Passed but not eligible for job");
		else
			System.out.println("Pass");

		if (x < 33) {
			System.out.println("Fail");
		} else {
			if (x >= 33 && x <= 50)
				System.out.println("ALmost Passed but not eligible for job");
			else
				System.out.println("Pass");

		}

	}

}
