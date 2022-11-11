package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExamples {

	public static void main(String[] args) {
		
		System.out.println("HashSet---------------");
		Set<String> s = new HashSet<String>();
		s.add("test1");
		s.add("test3");
		s.add("test2");
		s.add("test1");
		System.out.println(s);
		
		System.out.println("LinkedHashSet------------------");
		
		LinkedHashSet <String> ls = new LinkedHashSet<String>();
		ls.add("test1");
		ls.add("test2");
		ls.add("test3");
		ls.add("test1");
		System.out.println(ls);
		
		
		
		
		
		

	}

}
