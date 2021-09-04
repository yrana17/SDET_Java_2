package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		
		
		List<String> al = new ArrayList<String>();
		al.add("al3");
		al.add("al1");
		al.add("al2");
		System.out.println(al);
		
		java.util.Collections.sort(al);
		System.out.println(al);
		java.util.Collections.sort(al,java.util.Collections.reverseOrder());
		System.out.println(al);
		
		List<String> al1 = new ArrayList<String>();
		al1.add("al5");
		al1.add("al4");
		al1.add("al6");
		
		java.util.Collections.copy(al1, al);
		System.out.println(al1);
		
		System.out.println(java.util.Collections.max(al));
		System.out.println(java.util.Collections.min(al));
		
		java.util.Collections.addAll(al, "al22","al23");
		System.out.println(al);
		
		
	
		
		Set<String> set= new TreeSet<String>();
		set.add("al5");
		set.add("al4");
		set.add("al6");
		
		System.out.println(set);
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
