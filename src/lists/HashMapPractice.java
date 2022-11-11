package lists;

import java.util.HashMap;

public class HashMapPractice {
public static void main(String[] args) {
	
	HashMap<String, String> fun = new HashMap<String, String>();

	fun.put("DavidRobinson", "mypassword");
	fun.put("newyorkboys", "myoldpassword");
	
	System.out.println(fun.replace("DavidRobinson", "mypassword", "freedom") );
	System.out.println(fun.replace("newyorkboys", "myoldpassword", "free") );
	System.out.println(fun.values());
	System.out.println(fun.remove("DavidRobinson"));
	System.out.println(fun.values());
	System.out.println(fun.containsKey("DavidRobinson"));
	System.out.println(fun.remove("DavidRobinson"));
	

}
}
