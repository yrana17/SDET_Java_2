package languagebasics;

public class LearnVariables {

	String str="Instance Variable";
	
	static String strStatic ="Static Variable";
	
	
	/**
	 * Static main method
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		String strLocal="Local Variable";
		
		System.out.println("Local Variable:"+strLocal);
		
		LearnVariables learnVariable = new LearnVariables();	
		
		System.out.println(learnVariable.str);
		
		System.out.println(strStatic);
		
		learnVariable.print();
		
		/**
		 * Object  -> variables and Methods
		 */
	}
	
	/**
	 * Non Static Method
	 */
	public void print()
	{
		System.out.println(str);
		System.out.println(strStatic);
	}
	
	
	
	
}
