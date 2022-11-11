package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapPractic {

	public static void main(String[] args) {
	
		
		
		HashMap<String,String> hashMap = new HashMap<String,String>();
		
			hashMap.put("1", "Red");
		 	hashMap.put("2", "Green");
		    hashMap.put("3", "Black");
		    hashMap.put("4", "White");
		    hashMap.put("5", "Blue");
		   
		   
		    
	  for(Entry<String, String> entry:hashMap.entrySet()) {
		
		System.out.println(entry.getKey() +" " + entry.getValue());
		    }
//		 var hashMap = new HashMap<>();
//	    hashMap.put("1", "Red");
//	    hashMap.put("2", "Green");
//	    hashMap.put("3", "Black");
//	    hashMap.put("4", "White");
//	    hashMap.put("5", "Blue");
		
	//   for(Map.Entry entry:hashMap.entrySet())
//	    var entrySet = hashMap.entrySet();
//		
//	    for(var entry:entrySet) {
//		System.out.println(" "+ entry.getKey() + " " + entry.getValue());
//		
//	    }

	}

}
