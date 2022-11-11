package basics;

public class EvenOddFromArray {

	public static void main(String[] args) {
		
		
		int[] num1 = { 13, 25, 58, 42, 34, 27, 65, 18 };
		int[] num2 = { 23, 34, 21, 43, 98, 11, 16 };
    
    int oddNum = 0;
    int evenNum = 0;
  

  
  for (int i = 0; i < num1.length; i++) {
			if(num1[i] % 2 == 0) {
			evenNum = evenNum + num1[i];
      }
  }
for (int i = 0; i < num2.length; i++) {
			if(num2[i] % 2 != 0) {
			oddNum = oddNum + num2[i];
      
      }
      }
  
    System.out.println(evenNum + oddNum);
		}
	}

