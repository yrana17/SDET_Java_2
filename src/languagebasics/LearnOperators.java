package languagebasics;

public class LearnOperators {

	public static void main(String[] args) {

		LearnOperators obj = new LearnOperators();

		
		
		  obj.learnArithmethicOperators(15, 10); obj.learnRelationalOperator(10, 15);
		  System.out.println("**************************");
		  obj.learnRelationalOperator(15, 15);
		  System.out.println("**************************");
		  obj.learnRelationalOperator(20, 15);
		  System.out.println("**************************");
		  obj.learnLogicalOperator(10, 15);
		  System.out.println("**************************");
		  obj.learnTernaryOperator(15, 10);
		  System.out.println("**************************");
		 
		obj.learnUnaryOperators(5);
	}

	public void learnArithmethicOperators(int no1, int no2) {
		int result;
		result = no1 + no2;

		System.out.println("Addition:" + (no1 + no2));
		System.out.println("Addition:" + result);

		result = no1 - no2;
		System.out.println("Subtraction:" + result);

		System.out.println("Multiplicationn:" + (no1 * no2));

		System.out.println("Remainder:" + (no1 % no2));

		System.out.println("Quotient:" + (no1 / no2));
	}

	public void learnRelationalOperator(int no1, int no2) {
		System.out.println("Less Than no1<no2:" + (no1 < no2));
		System.out.println("Greater Than no1>no2:" + (no1 > no2));
		System.out.println("Less Than or Equal To no1<=no2:" + (no1 <= no2));
		System.out.println("Greater Than or Equal To no1>=no2:" + (no1 >= no2));

		System.out.println("Equals To a==b:" + (no1 == no2));
		System.out.println("NOt Equals To a!=b:" + (no1 != no2));
	}

	public void learnLogicalOperator(int no1, int no2) {

		System.out.println("AND Opeartor:" + (no1 >= no2 && no1 != 0));

		System.out.println("OR Opeartor:" + (no1 >= no2 || no1 != 0));

		System.out.println("NOT OPERATOR:" + !(no1 != 0));

	}

	public void learnTernaryOperator(int no1,int no2)
	{
		boolean b=(no1 <= no2) ? true : false;
		b=(no1 < no2) ? ((no1==0) ? false : true) : false;
		System.out.println(b);
	}

	public void learnUnaryOperators(int n)
	{
		System.out.println(n++); //5
		System.out.println(++n); //6+1=7
		
		
		System.out.println(--n); //6
		System.out.println(n--); //6
		
		n+=1;// n= n+1 = 5+1; 		//incremented by 1
		System.out.println(n);
		
		n = +1;    
		System.out.println(n); //initialise to 1
		n+=1;// n= n+1; 		//incremented by 1
		System.out.println(n);
		
		n=-1;
		n-=1;
		
	}


}
