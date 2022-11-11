package basics;

import java.util.Iterator;

public class MulitDiamensionArray {

	public static void main(String[] args) {
		
		
		int [][] num2D = new int [3][4];
		num2D [0][0] = 1;
		num2D [0][1] = 2;
		num2D [0][2] = 3;
		num2D [0][3] = 4;
		num2D [1][0] = 5;
		num2D [1][1] = 6;
		num2D [1][2] = 7;
		num2D [1][3] = 8;
		num2D [2][0] = 9;
		num2D [2][1] = 10;
		num2D [2][2] = 11;
		num2D [2][3] = 12;
		 System.out.println("num2D.length  " + num2D.length);
		 System.out.println("num2D.[0].length  " + num2D[0].length);
		
		 for(int row = 0; row < num2D.length; row++) {
			for(int col = 0; col < num2D[row].length; col++) {
			System.out.print("( " + row + ", " + col + ")\t");
				System.out.print(num2D[row][col] + " , ");	
			}
			
			System.out.println();
		}
		
		
		String [][] names = {{"Jva", "C"},{"C++","C#"},{"ASP.NET","JavaScript"}};
		for(String[] row : names) {
			for(String val : row) {
		System.out.print(val + ", ");
			}
		System.out.println();
		}
		
		
		int [][] temp = new int [5][3];
		
		int x = 1;
		int sum = 0;
		
		for (int row = 0; row < temp.length; row++) {
			for (int col = 0; col < temp[row].length; col++) {
				temp[row][col] = x++;
				
			}
		}
			
		for (int row = 0; row < temp.length; row++) {
			for (int col = 0; col < temp[row].length; col++) {
		System.out.print(temp[row][col] + " , ");
				sum += temp[row][col];
		
			}
		
		System.out.println();
		
	}
		
		
		System.out.println("Sum :" + sum);
		
		
		
	}
}
