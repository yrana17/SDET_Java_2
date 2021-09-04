package collection;

import java.util.HashMap;

public class MapProgram {

	public static void main(String[] args) {

		String str = "TestingisWorld";
		str=str.toUpperCase();
		char[] c = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (char d : c) {
			if (hm.containsKey(d))
				hm.put(d, hm.get(d) + 1);
			else
				hm.put(d, 1);
		}

		for (Character hm1 : hm.keySet()) 
			System.out.println(hm1 + "---" + hm.get(hm1));

	}
}
