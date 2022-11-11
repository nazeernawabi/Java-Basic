package practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetPractice {

	public static void main(String[] args) {


		HashSet <String>list = new HashSet<String>();
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		System.out.println("First HashSet content: " + list);

HashSet <String>list2 = new HashSet<String>();
		list2.add("Red");
		list2.add("Pink");
		list2.add("Black");
		list2.add("Orange");
    System.out.println("Second HashSet content: " + list2);
	//	HashSet <String>storage = new HashSet<String>();
    
    for(int i = 0;i<list.size();i++){
      for(int j = 0;j<list2.size();j++){
        if(i==j){
         System.out.println(list);
        }
          
        }
      }
  }

    

    
  

		
		
		}
    
		
    
    
		
		
		

	


