package basics;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<String> friendsArray = new ArrayList<>(Arrays.asList("John", "Chris", "Eric","Luke"));
		
		
		System.out.println(friendsArray.get(1));
		System.out.println(friendsArray.size());
		friendsArray.add("Mitch");
		System.out.println(friendsArray.get(4));
		System.out.println(friendsArray.size());
		friendsArray.set(0, "Carls");
		System.out.println(friendsArray.get(0));
		
		
		

	}

}
