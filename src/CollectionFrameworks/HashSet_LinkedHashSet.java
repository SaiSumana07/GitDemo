package CollectionFrameworks;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.hashset- no duplicates allowed but interstion order not preserved
		HashSet s=new HashSet();
		s.add("Sumana");
		s.add(123);
		s.add(null);
		s.add(true);
		s.add("Sumana");
		System.out.println(s);
		
		//1.linkedhashset- no duplicates allowed and interstion order  preserved
				LinkedHashSet s1=new LinkedHashSet();
				s1.add("Sumana");
				s1.add(123);
				s1.add(null);
				s1.add(true);
				s1.add("Sumana");
				System.out.println(s1);

	}

}
