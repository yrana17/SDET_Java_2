package conditionalstatements;

public class SwitchCase {

	
	public static void main(String[] args) {
		
		
		int monthNo=5;
		
		switch (monthNo) {
		case 1:
			System.out.println("January");
			
		case 2:
			System.out.println("February");
			
		default:
			System.out.println("Invalid MonthNo");
			
		}
		
		
		char x= 'd';
		
		switch (x) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowels");
		default:
			System.out.println("Consonants");			
			break;
		}
		
		
		
	}
	
}
