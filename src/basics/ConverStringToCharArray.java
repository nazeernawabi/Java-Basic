package basics;

import java.util.Arrays;

public class ConverStringToCharArray {

	public static void main(String[] args) {
		
	String words = "TEKschool";
	char[] letters = words.toCharArray();
	System.out.println(Arrays.toString(letters).replace("[", "(" ).replace("]", ")").replace(",", ")").replace(" ", "("));
	
	}

	}


