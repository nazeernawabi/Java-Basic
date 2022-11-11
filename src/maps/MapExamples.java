package maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
		
		
		System.out.println("Hashtable-----------------------------------");
		//can't take null for key and value
		//un-ordered
		//synchronized/thread-safe
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(1, "Jason");
		ht.put(2, "Mike");
		ht.put(3, "Jack");
		ht.put(4, "Val");
		ht.put(5, "Doe");
		ht.put(6, "Matt");
		System.out.println(ht);
		
		System.out.println("HashMap-----------------------------------");
		//it can take null
		//un-ordered
		//non-synchronized/non-thead-safe
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("K1", "V1");
		hm.put("K2", "V2");
		hm.put("K3", "V3");
		hm.put("K5", "V4");
		hm.put("K5", "V5");
		hm.put(null, null);
		System.out.println(hm);
		
		System.out.println("LinkedHashMap-----------------------------------");
		//ordered list
		//It is backed by doubly lined list structure
		LinkedHashMap<String,String> lhm = new LinkedHashMap<String,String>();
		lhm.put(null, null);
		lhm.put("1", "L1");
		lhm.put("2", "L2");
		lhm.put("3", "L3");
		lhm.put("4", "L4");
		lhm.put("5", "L5");
		System.out.println(lhm);
		
		
		
		System.out.println("TreeMap-----------------------------------");
		//Orders by key
		//Does not accept null
		
		TreeMap<String,String> tm = new TreeMap<String, String>();
		tm.put("5", "C5");
		tm.put("2", "C2");
		tm.put("4", "C4");
		tm.put("6", "C6");
		tm.put("3", "C3");
		tm.put("1", "C1");
		System.out.println(tm);
		

	}

}
