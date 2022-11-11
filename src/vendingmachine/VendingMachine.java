package vendingmachine;

public class VendingMachine {

	product[][]items;
	
	
	public VendingMachine() {
		items = new product[3][5];
		
	}
	
	public void addItem(product p, int row, int col) {
	items[row][col] = p;
	
	}
	
	
	public boolean sellItem(boolean payment, int row, int col) {
		if (payment == true) {
			return items[row][col].dispinse();
			
			
		}else {
		
			
			System.out.println("payment failed");
		return false;
		}
		
		}	
	
	
	
	
	public String toString() {
		String temp = "Vending Machine\n";
		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[row].length; col++) {
				if (items[row][col] == null) {
					temp += "*empty*";
					
				}else {
					temp += items[row ][col ].name + "," + items[row][col].qty + " \n";
				}
				
			
			}
		
		
		}
		
		
		
		return temp;
		
	}
}
	
	
	
	
	
	
	
	

