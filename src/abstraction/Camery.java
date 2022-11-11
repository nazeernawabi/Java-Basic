package abstraction;

public class Camery extends Toyota{

	@Override
	public void airbag() {
		System.out.println("this car has 10 airbags");
		
	}

	@Override
	public void breaks() {
		System.out.println("this car is equipped with ABS break system");
		
	}

	@Override
	public void seatBelt() {
		System.out.println("this car is equipped with 5 passenger seatBelts");
		
	}
	public static void main(String[] args) {
	
		Camery car2 = new Camery();
		car2.airbag();
		car2.breaks();
		car2.seatBelt();
		
		
		
		
}
}
