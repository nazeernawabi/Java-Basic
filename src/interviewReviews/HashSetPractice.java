package interviewReviews;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetPractice {

	public static void main(String[] args) {


		HashSet<String> list = new HashSet<String>();
		
		list.add("Red");
		list.add("Green");
		list.add("Black");
	    list.add("Yellow");
		list.add("White");
		list.add("Pink");
		System.out.println(list);
	
		System.out.println("**************forEach loop***************");
		
		for(String colors:list) {
			System.out.println(colors);
			
		}
		
		System.out.println(list.size());
		list.remove("Pink");
		System.out.println(list);
		
		System.out.println("**************while loop and iterator***************");
		
		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("**************HashSet to TreeSet***************");
		Set<String> hashSetToTreeSet = new TreeSet<String>();
		
		hashSetToTreeSet.addAll(list);
		for(String str:hashSetToTreeSet) {
			System.out.println(str);
		}
		System.out.println("*************HashSet to ArrayList****************");
		ArrayList<String> hashSetToArrayList = new ArrayList<String>();
		
		hashSetToArrayList.addAll(list);
		for(String str:hashSetToArrayList) {
			System.out.println(str);
		}
		
		System.out.println("*************compare two hashset****************");
		
		HashSet <String>list1 = new HashSet<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Black");
		list1.add("White");
		
		HashSet <String>list2 = new HashSet<String>();
		list2.add("Red");
		list2.add("Pink");
		list2.add("Black");
		list2.add("Orange");
		
		HashSet<String> storage = new HashSet<String>();
		for(String words:list1) {
			//storage.add(words);
			storage.add(list2.contains(words)?"Yes":"No");
			for(String j:storage) {
				System.out.println(j);
			
		}	
		}
	
		System.out.println("*************test****************");
		
		ArrayList<String> storage2 = new ArrayList<String>();
		storage2.addAll(list1);
		storage2.addAll(list2);
		for(int k=0;k<storage2.size();k++) {
			
			System.out.println(storage2.get(k));
		}
	
	}

}
