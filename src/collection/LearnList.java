package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class LearnList {

	
	public static void main(String[] args) {
		
		List<String> lst = new ArrayList<String>();
		lst.add("ABC");
		lst.add("BCD");
		lst.add("AAA");
		lst.add("BCD");
		lst.add(null);

		//lst.remove(1);
		
		System.out.println(lst);
	
		
		List<String> l=lst.subList(0, 3); //0 as idx 3 as length
		System.out.println(l);
		System.out.println("-----------------");
		
		
		List<String> lst1 = new ArrayList<String>();
		lst1.add("ABC");
		lst1.add("BCD");
		lst1.add("AAA");
		lst1.add("BCD");
		
		
		System.out.println(lst.contains("BCD"));
		System.out.println(lst1.contains("ABC"));
		
		
		
		
		ListIterator<String> itr= lst1.listIterator();
		
		System.out.println("Forward Tracing");
		itr.set("BCDE");
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Backward Tracing");
		while(itr.hasPrevious())
			System.out.println(itr.previous());
		
		
		
		
		
		
		
		
		
		
		lst = new LinkedList<String>();
		lst.add("ABC");
		lst.add("BCD");
		lst.add("AAA");
		lst.add("BCD");
		lst.add(null);
		System.out.println(lst);
		
		
		lst =new Vector<String>();
		lst.add("ABC");
		lst.add("BCD");
		lst.add("AAA");
		lst.add("BCD");
		lst.add(null);
		System.out.println(lst);
		
		
		
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		
		for (String string : lst) {
			System.out.println(string);
		}
		
		
		
		
		
		
		
		
	}
	
	
}

