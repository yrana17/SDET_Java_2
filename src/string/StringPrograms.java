package string;

public class StringPrograms {

	
	public static void main(String[] args) {
		
		/*
		 * String str="C:\\Users\\USERID\\Desktop\\DevLab Training\\TEST.xlsx";
		 * 
		 * 
		 * 
		 * //1.Test.xlsx str=str.substring(str.lastIndexOf("\\")+1 );
		 * System.out.println(str);
		 * 
		 * //2. .xlsx System.out.println(str.substring(str.lastIndexOf(".")));
		 * 
		 */
		
		String str="100110110010101100001";
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{		
				if(str.charAt(i) == '1' && str.charAt(j)=='1')
					System.out.println(str.substring(i, j+1));
			}
		}
		
		
		
		
		
		
		
		
	}
}
