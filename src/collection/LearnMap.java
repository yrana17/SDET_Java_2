package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {

		
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("Name", "Test");
		mp.put("Class", "AB");
		mp.put("Address", "Delhi");
		mp.put(null, "value2");
		mp.put("key2", null);
		mp.put(null, "value3");
		
		System.out.println(mp);
		
		System.out.println(mp.get("Class"));
		
		
		if(mp.containsKey("Class1"))
			System.out.println(true);
		else
			System.out.println(false);
		
		
		mp = new LinkedHashMap<String, String>();
		mp.put("Name", "Test");
		mp.put("Class", "AB");
		mp.put("Address", "Delhi");
		mp.put(null, "value2");
		mp.put("key2", null);
		mp.put(null, "value3");
		
		System.out.println(mp);
		
		
		mp = new TreeMap<String, String>();
		mp.put("Name", "Test");
		mp.put("Class", "AB");
		mp.put("Address", "Delhi");
		//mp.put(null, "value2");
		mp.put("key2", null);
		
		System.out.println(mp);
		
		
		mp = new Hashtable<String, String>();
		mp.put("Name", "Test");
		mp.put("Class", "AB");
		mp.put("Address", "Delhi");
		//mp.put(null, "value2");
		//mp.put("key2", null);
		System.out.println(mp);
		
		
		
		for (String key : mp.keySet()) {
			System.out.println(key+"=="+ mp.get(key));
		}
		
		
		
	}
}
