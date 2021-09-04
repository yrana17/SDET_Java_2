package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("BD");
		set.add("AB");
		set.add("BB");
		set.add(null);
		
		System.out.println(set);
		
		
		set = new LinkedHashSet<String>();
		set.add("BD");
		set.add("AB");
		set.add("BB");
		set.add("BB");
		set.add(null);
		System.out.println(set);
		
		
		set = new TreeSet<String>();
		set.add("BD");
		set.add("AB");
		set.add("BB");
		set.add("BB");
		//set.add(null);
		System.out.println(set);
		
		
		for (String string : set) {
			System.out.println(string);
		}

		
		System.out.println("Iterator---------------");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		
		
		
		
	}

}
