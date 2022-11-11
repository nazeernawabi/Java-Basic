package practice;


import java.util.Iterator;
import java.util.TreeSet;



public class TreeSetReversePractice {

	public static void main(String[] args) {
		
		TreeSet<String> colors = new TreeSet<String>();
	      colors.add("Red");
	      colors.add("Green");
	      colors.add("Black");
	      colors.add("Pink");
	      colors.add("orange");	
	      
	      Iterator<String> iterator = colors.descendingIterator();
	      
	      while(iterator.hasNext()) {
	    	  System.out.println(iterator.next());
	      }
		

	     
	      
	      
	}

}
