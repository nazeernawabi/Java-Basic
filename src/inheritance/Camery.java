package inheritance;

public class Camery extends Toyota {

	
	
	public void speed() {
		System.out.println("this car reaches to 0-100 in 5 seconds");
	}
	
	public void sports() {
		System.out.println("this car has sport option");
	}
	
	public static void main(String[] args) {
		
		
		Camery car2 = new Camery();
		car2.brand = "Toyota";
		car2.honk();
		car2.speed();
		car2.sports();
		
		
		
		
		
	}
	
}
