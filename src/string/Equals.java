package string;

public class Equals {

	public static void main(String[] args) {
		
		
		
		String str1="ABD";
		String str2="ABD";
		System.out.println(str1.equals(str2));
		
		System.out.println(str1==str2);
		
		
		String str3= new String("ABD");
		String str4= new String("ABD");
		
		
		System.out.println(str3.equals(str4));
		System.out.println(str3==str4);
		
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		
		
		
		
		
	}
	
}
