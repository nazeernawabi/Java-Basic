package classObject2;

public class Main {

	int modelYear;
	String modelName;
	
	public Main(int year, String name) {
		
		modelYear = year;
		modelName = name;
		
	}
	
	public static void main(String[] args) {
		
		Main myObject = new Main(1969, "Mustang");
		System.out.println(myObject.modelName + " " + myObject.modelYear);
		
	}
	
}
