package vendingmachine;

public class product {

	String name;
	double price;
	int row;
	int col;
	int qty;
	public product() {
		name = "";
		price = 0;
		qty = 0;
		
	}
	
	public product(String newName, double newPrice, int newQTY) {
		name = newName;
		price = newPrice;
		qty = newQTY;
		
	}
	public void printProductInfo() {
		System.out.println("Projuct [Name: " + name + ", Price; $ " + price + ", Quantity;" + qty + "]");
	}
	
	public boolean dispinse() {
		if (qty>0) {
			qty--;
			System.out.print("Item Sold => New Product into=>");
			printProductInfo();
			return true;
		}else {
			System.out.println("Out Of Stock!");
			return false;
		}
		
	}
		public int reStock(int newQty) {
			qty += qty + newQty;
			return qty;
			
		}
		
		
		
	
	
	
	public static void main(String[] args) {
		product obj = new product();
		obj.name = "Lays";
		obj.price = 5.55;
		obj.qty = 10;
		
		
		obj.printProductInfo();
		
		product obj2 = new product("M&M", 3.99, 0);
		obj2.printProductInfo();
		obj2.dispinse();
		obj2.dispinse();
		obj2.reStock(5);
		obj2.dispinse();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
