package languagebasics;

public class LearnDataTypes {

	/**
	 * Instance Variable
	 */
	String str="Test";
		
	/**
	 * Variables inside main methods are local variable
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * 1 bit size  -> 
		 */
		boolean bflg = false ;
		System.out.println("Boolean Type Variable Value:"+bflg);
		bflg=true;
		System.out.println("Boolean Type Variable Value:"+bflg);
		
		
		/**
		 * Integer type
		 * short-2, int-4,long-8
		 */
		short val1=32767; //-32768-+32767
		int val2=1234;
		long var3=234;
		
		System.out.println(val1+val2+var3);
		/**
		 * byte - 1byte
		 * -128 to 127 
		 */
		byte b=127;
		System.out.println("Byte:"+b);
		
		/**
		 * char type
		 */
		char c='A';
		System.out.println(c);
	
	
		/**
		 * String
		 */
		String str ="Test asj ashvdbjdkfc";
		System.out.println(str);
	
		/**
		 * Decimal Types : Float(4) and Double(8)
		 */
		double d = 123.4567123456;
		float f = 123.345123456789f;
		
		System.out.println("Double:"+d);
		System.out.println("Float:"+f);
	
	}
	
	
	
}

