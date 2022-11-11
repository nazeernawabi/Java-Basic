package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapJoinPractice {

	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<String, String>();

		hashMap.put("1", "Red");
		hashMap.put("2", "Green");
		hashMap.put("3", "Black");
		System.out.println("Values in first map: " + hashMap);

		HashMap<String, String> hashMap2 = new HashMap<String, String>();

		hashMap2.put("4", "White");
	   	hashMap2.put("5", "Blue");
	    hashMap2.put("6", "Orange");

		System.out.println("Values in second map:  " + hashMap2);

		hashMap.putAll(hashMap2);
		System.out.println("Now values in second map: "+hashMap);
		
	}
}
