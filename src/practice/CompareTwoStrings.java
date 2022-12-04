package practice;

import org.w3c.dom.Text;

public class CompareTwoStrings {

	public static void main(String[] args) {
		
		String str1 = "apples are great for your health";
		String str2 = "Bananas are tasty";
		
		System.out.println(str1);
		System.out.println(str2);
		if(str1.compareTo(str2) >0)System.out.println("Str1 is after str2");
		if(str1.compareTo(str2)<0) System.out.println("Str1 before str2");
		
		
		String test = "Java8 makes Java more powerful";
		System.out.println(test.contains("Java8"));
		
		
		
		
		
		
		

	}

}
