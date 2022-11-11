package basics;

public class ReverseNumbers {

	public static void main(String[] args) {
		
		int start = 1;
		int stop = 10;
		boolean reverse = false;
		
		
		reverse = true;


				System.out.print("[");
				if (reverse) {
					
					for (int i = stop; i >= start; i--) {
						
						if (i > start) {
							
							System.out.print(i + ", ");
						} else {
							
							System.out.print(i);
						}

					}

				} else {
					for (int i = start; i <= stop; i++) {
						
						if (i < stop) {
							
							System.out.print(i + ", ");
						} else {
							
							System.out.print(i);
						}

					}
				}

				System.out.println("]");

				System.out.println("*********************************");;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
