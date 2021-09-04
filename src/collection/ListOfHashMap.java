package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListOfHashMap {

	
	
	public static void main(String[] args) {
		
		List<HashMap<String, String>> lst = new ArrayList<HashMap<String,String>>();
		
		
		for(int i=0; i<5;i++)
		{
			HashMap<String, String> tmp = new HashMap<String, String>();
			tmp.put("Head1", "Value1-"+(i+1));
			tmp.put("Head2", "Value2-"+(i+1));
			tmp.put("Head3", "Value3-"+(i+1));
			tmp.put("Head4", "Value4-"+(i+1));
			
			lst.add(tmp);
			HashMap<String, String> tmp1 = new HashMap<String, String>();
			
			for(String k: tmp.keySet())
			{
				if(tmp.get(k).equals(tmp1.get(k)))
					System.out.println("Pass");
				else
					System.out.println("Fail");
			}
				
		}
		
		System.out.println(lst);
		
		HashMap<String,String> m=lst.get(1);
		System.out.println(m.get("Head1"));
		
	}
	
}
