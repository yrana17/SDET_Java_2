package collection;

import java.util.ArrayList;
import java.util.List;

public class ListProgram {

	public static void main(String[] args) {

		List<String> lst = new ArrayList<String>();
		lst.add("ABC");
		lst.add("BCD");
		lst.add("AAA");
		lst.add("BCD");
		lst.add(null);
		lst.add("BCE");
		lst.add("BCF");
		
		for (int i = 0; i < lst.size(); i+=5) {
			System.out.println(i);
			System.out.println(Math.min(lst.size(), i+5));
			List<String> l = lst.subList(i, Math.min(lst.size(), i+5));
			System.out.println(l);
		}
		
		lst.isEmpty();
	}
	
	public boolean getCOnnectionData(String connName, List<String> al)
	{
		if(al.contains(connName))
			return true;
		else
			return false;
	}
	
	
	

}
