package basics;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your number");
		scan.nextInt();
		int i = scan.nextInt();
		
		
		//int sum;
		
	//	sum = 0;

		do {
			System.out.println(i);
			i++;
		} while (i <= 20);

		//sum = sum + i;

	}

}
