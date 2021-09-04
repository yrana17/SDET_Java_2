package wrapper;

public class TypeCastingAndConversion {

	
	public static void main(String[] args) {
		
		
		//Conversion
		
		int x=10;
		
		long y;
		
		y=x;
		System.out.println(y);
		
		//Casting
		double d=10.5d;
		int i = (int) d;
		System.out.println(i);
		
		long l1=10000;
		int x1= (int) l1;
		System.out.println(x1);
		
		
		System.out.println("------------------------");
		//char to int
		
		char c=0;
		int n=65;
		c= (char) n;
		System.out.println(c);
		
	}
	
}
