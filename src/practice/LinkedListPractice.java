package practice;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<>();
		list1.add(0, "Red");
		list1.add(1, "Green");
		list1.add(2, "Black");
		list1.add(3, "White");
		list1.add(4, "Pink");
		System.out.println("Original linked list:" + list1);
		list1.isEmpty();
		System.out.println("Check the above linked list is empty or not! false");
		
		list1.removeAll(list1);
		System.out.println("Linked list after remove all elements " + list1);
		
		list1.isEmpty();
		System.out.println("Check the above linked list is empty or not! true" );
	}

}
