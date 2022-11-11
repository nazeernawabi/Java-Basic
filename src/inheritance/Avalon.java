package inheritance;

public class Avalon extends Toyota {
	public String modelName = "Avalon";
	
	static void comfort() {
		System.out.println("this car has smoth ride");
	}
	
	
	
	public static void main(String[] args) {
		
		Avalon car1 = new Avalon();
		car1.brand = "Toyota";
		car1.modelName = "Avalon";
		car1.honk();
		Avalon.comfort();
		System.out.println(car1);
		
		
		
	}
	
	
}
