package CollectionFrameworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_LinkedList {
	
	public static void main(String[] args) {
		
		//arraylist -list of indexed elements - searching elements easier duplicates allowed and insertion order prserved,adding diff
		ArrayList al=new ArrayList();
		al.add("Sai Sumana");
		al.add("A");
		al.add(123);
		al.add(2.344);
		al.add(null);
		al.add(true);
		System.out.println(al);
		
		//linkedlist -list of non indexed linked elements - searching elements diff as linked need to traverse ,adding eaasier need to provide a link ,duplicates allowed and insertion order prserved
				LinkedList ll=new LinkedList();
				ll.add("Sai Sumana");
				ll.add("A");
				ll.add(123);
				ll.add(2.344);
				ll.add(null);
				ll.add(true);
				System.out.println(ll);
				
		List l=new ArrayList();//can also create as list is usper class of arraylist implemnted class
				
	}

}
