package interviewReviews;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListAdd {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add(0,"Red");
		list.add(1,"blue");
		list.add(2,"Green");
		list.add(3,"Orange");
		//Collections.sort(list);
		//System.out.println(list);
		
		System.out.println(list.subList(0, 2));
		System.out.println("***********************for loop *********************************");
		if(list.contains("Orange")) {
			System.out.println("list contains Orange");
		}else
			System.out.println("list DOES NOT contain Orange");
		
		for(String color:list) {
			System.out.println(color);
		}
		
		System.out.println("***********************for loop *********************************");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("************************* *******************************");
		
		
		String[] array = {"Pink","Yellow","Purple","Brown"};
		
		for(String color:array) {
			System.out.println(color);
		}
		
		System.out.println("*************************for loop*******************************");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("********************************************************");	
		int [] numbers = new int [10];
		numbers [0]=100;
		numbers [1]=200;
		numbers [2]=300;
		numbers [3]=400;
		numbers [4]=500;
		numbers [5]=600;
		numbers [6]=700;
		numbers [7]=800;
		numbers [8]=900;
		numbers [9]=1000;
		
		for(int data:numbers) {
			System.out.println(data);
		}
		
		System.out.println("***************************for loop*****************************");
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("********************************************************");
		
		
		
		
		
	}
}
