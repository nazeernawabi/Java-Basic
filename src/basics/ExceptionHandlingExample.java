package basics;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		String x = "";
		int [] nums = {1,1,1,1,1};
		
		
		
		try {
			System.out.println(a/b);
			System.out.println(x.charAt(3));
			
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}catch (Exception e ) {
			System.out.println("Any exception");
			
		}finally {
			System.out.println("Finally");
		}
		
		System.out.println("End of the block");
		
		
		
		
		
		
		
		
	
		
		
		
	}
	
}
