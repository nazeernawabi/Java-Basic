package inheritance;

public class Corolla extends Toyota{

	public int speed(int speed) {
		
	return 200;
	}
		public void gassMileage() {
			System.out.println("this car takes one gallon per 35 miles");
		}
	
public static void main(String[] args) {
	Corolla car3 = new Corolla();
	car3.brand = "Toyota";
	car3.honk();
	car3.speed(200);
	car3.gassMileage();
	System.out.println(car3.brand + " " + "Speed " + car3.speed(200) + "Per Hour");
}

}
	

