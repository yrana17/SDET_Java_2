package string;

public class LearnString {

	public static void main(String[] args) {
				
		char[] ch = {'t','e','s','t'};
		
		String s = new String(ch);
		System.out.println(s); 

		
		String str="ABD is legend";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(11));
		
		//str.concat(" in cricket");
		
		//System.out.println(str);
		
		str=str.concat(" in cricket");
		
		System.out.println(str);
		
		
		System.out.println(str.indexOf("e"));
		System.out.println(str.lastIndexOf("e"));
	
		
		System.out.println(str.equals("ABD is legend in cricket"));
		System.out.println(str.equalsIgnoreCase("ABD is legend in CRicket"));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String str2=" ABD  is legend ";
		System.out.println(str2);
		System.out.println(str2.trim());
		
		System.out.println(str2.replace("ABD", "Virat"));
		System.out.println(str2.replaceAll("e","#"));
		
		
		System.out.println(str.startsWith("ABD"));
		System.out.println(str.endsWith("cricket"));
		
		String[] arr=str.split(" ", 2);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(str.contains("legend"));
		
		
		System.out.println(str.substring(4));
		System.out.println(str.substring(4,7));
		
		System.out.println(str.compareTo(str2));
		
		
		
		
	}
	
	
}
