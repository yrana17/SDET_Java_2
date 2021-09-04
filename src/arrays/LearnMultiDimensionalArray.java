package arrays;

public class LearnMultiDimensionalArray {

	public static void main(String[] args) {

		int[][] arr = new int[1][3];
		arr[0][0]  =17;
		arr[0][1]  =19;
		arr[0][2]  =21;
	
		
		/**
		 * No of Rows and Column
		 */
		System.out.println(arr.length); //ROw
		System.out.println(arr[0].length); //Col
		
		
		for(int i=0;i<arr.length;i++)
		{
			int col=arr[i].length;
			for(int j=0;j<col;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println("");
		}
		
		int[][] arr1 = {
				{1,2,3},
				{4,5,6,7},
				{8,9,10,11,12}
		};
		
		
		
		
		int[][] ar = {
				{1,3,4},
				{2,5,7},
				{8,9,0}
		};
		
		
		int[][] transpose = new int[3][3];
		
		System.out.println(ar.length);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				transpose[i][j] = ar[j][i];
				
			}
		}
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		
		
		
		
	}
	

}
