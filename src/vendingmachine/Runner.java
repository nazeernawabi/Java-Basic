package vendingmachine;

public class Runner {

	public static void main(String[] args) {
		
		product p1 = new product("M&M ", 3.99 , 18 );
		product p2 = new product("Cake ", 3.99 , 28 );
		product p3 = new product("Coke ", 5.99 , 81 );
		product p4 = new product("Juice ", 1.99 , 82 );
		product p5 = new product("Bar ", 6.99, 78);
		product p6 = new product("Cokie ", 3.99, 18);
		product p7 = new product("Milk ", 2.99, 28);
		product p8 = new product("7Up ", 8.99, 38);
		product p9 = new product("Orange ", 10.99, 8);
		product p10 = new product("Skitles ", 3.99, 8);
		product p11 = new product("Gum ", 9.99, 18);
		product p12 = new product("RedBull ", 1.99, 18);
		product p13 = new product("Monster ", 2.99, 28);
		product p14 = new product("Water ", 3.99, 28);
		product p15 = new product("Tea ", 5.99, 18);
		
		VendingMachine machine1 = new VendingMachine();
		machine1.addItem(p1, 0, 0);
		machine1.addItem(p2, 0, 1);
		machine1.addItem(p3, 0, 2);
		machine1.addItem(p4, 0, 3);
		machine1.addItem(p5, 0, 4);
		
		machine1.addItem(p6, 1, 0);
		machine1.addItem(p7, 1, 1);
		machine1.addItem(p8, 1, 2);
		machine1.addItem(p9, 1, 3);
		machine1.addItem(p10,1, 4);
		
		machine1.addItem(p11, 2, 0);
		machine1.addItem(p12, 2, 1);
		machine1.addItem(p13, 2, 2);
		machine1.addItem(p15, 2, 3);
		machine1.addItem(p15, 2, 4);
		
		
		System.out.print(machine1);
		
		machine1.sellItem(true, 01, 1);
		

	}

}
