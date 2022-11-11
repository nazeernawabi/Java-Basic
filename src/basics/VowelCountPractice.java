package basics;

public class VowelCountPractice {

	public static void main(String[] args) {
		
		String str = "I would like to find vowel letters in this string";
		int vCount = 0;
		int index = 0;
		
		while(index < str.length()) {
			char a = str.toLowerCase().charAt(index++);
			if(a == 'e' || a =='i' || a == 'o' || a == 'u') {
				
				++vCount;
			}
	}
	
		System.out.println("Total number of vowels in this string = " + vCount);
	
	}
}
