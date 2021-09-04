package loops;

public class NestedLoops {

	public static void main(String[] args) {

		for (int i = 10; i <= 20; i++) {
			System.out.println("Printing Table for " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		
		int totalRows=10;
		for(int irow=1;irow<=totalRows;irow++)//total 10 time
		{	
			for(int icol =1;icol<=irow;icol++) //Row ID   ==> rowid=1  
			{
				System.out.print(icol);
			}
			System.out.println("");
		}
		
		int val=0;
		for(int irow=1;irow<=totalRows;irow++)//total 10 time
		{	
			for(int icol =1;icol<=irow;icol++) //Row ID   ==> rowid=1  
			{
				System.out.print(val+" ");
				val=val+1;
			}
			System.out.println("");
		}
		
		
		for(int i=1;i<=totalRows;i++)
		{
			for(int j=i;j<=totalRows;j++)
			{
				System.out.print(j+" ");
			}
			
			for(int k=1;k<i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println("");
		}

	}
}