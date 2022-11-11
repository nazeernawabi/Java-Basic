package basics;

import java.util.ArrayList;


public class Practice {

	public static void main(String[] args) {
		
		
		double grades[] = {95.1,99.2,56.3,88.4,45.5,85.6,86.8,87.7,97.1,58.9,56.5,52.9,45.6};
		
		double max;
		max = grades[0];
		
		for (int i = 0;i <=12; i ++) {
			
			System.out.println("grades for index " + i + " is " + grades[i]);
		}
		
		
		for (double d : grades) {
			System.out.println("grades is " + d);
		
		for (int i =0; i > max; i++) {
			if(grades[i] > max) max = grades[i];
			
		}
			System.out.println(" The max grades in the class is : " + max);
		}
		
	
		ArrayList <String> list = new ArrayList<String>();
		list.add("Dave");
		list.add("Matt");
		list.add("John");
		list.add("Chris");
		list.add("Mike");
		list.add("Jerrod");
		list.add("Ahmad");
		list.add("Tony");
		System.out.println(list.get(0));
		
		for (String string : list) {
			
			System.out.println(string);
		}
	
		
		int numbers[]= new int [20];
		for(int i = 0; i < 19; i++) {
			numbers[i] = i;
			
		}
		for(int i = 0; i <19; i++) {
			System.out.println("value of index " + " is " + i + "   " + numbers[i]);
		}
		
		
		
		
		
		
		
		
	}

}
