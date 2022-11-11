package basics;

public class ForDemo {

	public static void main(String[] args) {
		
		
		for(int i = 1;i < 11; i++) {
			System.out.println("Count is:" + i);
		}
		
		
		String[] cities = {"Vienna", "Alexandria", "London", "Istanbul", "Dubai", "Tehran"};
		for(int index = 0; index < cities.length; index ++) {
			
			String city = cities[index];
			if(city.startsWith("V")) {
				System.out.println(city);
			}
				
		}
		
		
		String str1 = "I would like to find vowel letters in this string";
		int index = 0;
		int vCount = 0;
		
		for(int i = 0; i < str1.length(); i ++) {
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
