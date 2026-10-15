package CollectionFrameworks;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap_LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.hasnmap - key value pairs - duplicate keys - will overwrite values
		HashMap h=new HashMap();
		h.put(1, "Sumana");
		h.put(2, 500);
		h.put(3, null);
		h.put(4,true);
		h.put(2, "Sai Sumana");
		System.out.println(h);
		
		//1.linkedhasnmap - key value pairs - duplicate keys - will overwrite values
				LinkedHashMap h1=new LinkedHashMap();
				h1.put(1, "Sumana");
				h1.put(2, 500);
				h1.put(3, null);
				h1.put(4,true);
				h1.put(2, "Sai Sumana");
				System.out.println(h1);

	}

}
