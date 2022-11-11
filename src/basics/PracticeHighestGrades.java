package basics;

public class PracticeHighestGrades {

	public static void main(String[] args) {
		
		
double grades[] = {95.1,99.2,56.3,88.4,45.5,85.6,86.8,87.7,97.1,99.9,56.5,52.9,45.6};
		
		double max;
		double min;
		max = grades[0];
		min = grades [0];
		
		
		for (int i =0; i  < grades.length; i++) {
			
			if(grades[i] > max) max = grades[i];
			
		}
			System.out.println(" The max grades in the class is : " + max);	
			
			for (int i =0; i  < 12; i++) {
				
				if(grades[i] < min) min = grades[i];
				
			}
				System.out.println(" The min grades in the class is : " + min);	

	}

}
