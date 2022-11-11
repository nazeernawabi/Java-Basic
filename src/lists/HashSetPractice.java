package lists;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

	public static void main(String[] args) {
		
	
	
	Set <String> set = new HashSet<String>();
	set.add("Dave");
	set.add("Mike");
	set.add("Jim");
	set.add("Mary");
	set.add("Mikie");
	set.add("Mo");
	set.add("Mac");
	set.add("tylor");
	set.add("Pual");
	System.out.println(set);
	System.out.println(set.add("Mo"));
	System.out.println(set);
	System.out.println(set.size());
	System.out.println(set.remove("Mike"));
	System.out.println(set);
	
	
	
	
	}	
}
