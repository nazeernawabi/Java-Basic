package bankExample;

public class RunnerForBank {

	public static void main(String[] args) {


		Customer p1 = new Customer("Michael Jackson", "(682) 5534111" , "1178 Paulo Ave Vacaville", "michaeljackson@yahoo.com", "01/05/1966", "1234", 122334455) ;
		
		System.out.println(p1);
		System.out.println(p1.getFullName());
		p1.checkBalance("1234");
	}

}
