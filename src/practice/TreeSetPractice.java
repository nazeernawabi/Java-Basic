package practice;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {

		TreeSet<Integer> list = new TreeSet<>();

	
		list.add(10);
		list.add(22);
		list.add(25);
		list.add(36);
		list.add(16);
		list.add(70);
		list.add(82);
		list.add(89);
		list.add(14);
		System.out.println("Original tree set: " + list);
		
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Removes 70 from the list:true " );
		//System.out.println("Please enter your integer");
		int input=scan.nextInt();
		
		list.remove(input);
		
		System.out.println("Tree set after removing last element: " + list);
		scan.close();
		}
	}


