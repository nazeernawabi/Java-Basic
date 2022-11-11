package practice;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		
		ArrayList<String> list1 = new ArrayList<>();
	    list1.add(0, "Red");
	    list1.add(1, "Green");
	    list1.add(2, "Black");
	    list1.add(3, "White");
	    list1.add(4, "Pink");
     System.out.println("List of first array"+ list1);
    
    ArrayList<String> list2 = new ArrayList<>();
	    list2.add(0, "Red");
	    list2.add(1, "Green");
	    list2.add(2, "Black");
	    list2.add(3, "Pink");
	   
	    System.out.println("List of second array" + list2);
    list1.addAll(list2);
	   System.out.println("Joined array:" +list1);
	    
	    
	}
 }
		
		
		

	


