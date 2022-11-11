package basics;

import java.util.ArrayList;

public class ClassExcersize {

	public static void main(String[]args) {
		
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("David");
		str.add("Rob");
		str.add("Dave");
		str.add("Shane");
		str.add("Mike");
		str.add("Jerrod");
		str.add("Brian");
		System.out.println(str.get(0));
		System.out.println(str.size());
		System.out.println(str);
		System.out.println(str.set(1, "Mikie"));
		System.out.println(str.get(1));
		System.out.println(str.remove(1));
		System.out.println(str.get(1));
		System.out.println(str.isEmpty());
		for(String i: str) {
		}
		
	
	
	
	}
	
	
}
