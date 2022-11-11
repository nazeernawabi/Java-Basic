package abstraction;



public class Avalon extends Toyota {

	public void heatSeats() {
		System.out.println("Driver and passanger seats are conditioned");
	}
	public void leatherSeats() {
		System.out.println("this car has premium leathe seats and wood trims");
	}
	@Override
	public void airbag() {
		System.out.println("This car has 15 airbags");	
	}
	@Override
	public void breaks() {
		System.out.println("this car is equipped with ABS break system");
	}
	@Override
	public void seatBelt() {
		System.out.println("this car is equipped with seatbelts for 5 passengers");
	}
	public static void main(String[] args) {
		
		Avalon car1 = new Avalon();
		
		car1.airbag();
		car1.breaks();
		car1.seatBelt();
		car1.leatherSeats();
		car1.heatSeats();
		
		
	}
}
