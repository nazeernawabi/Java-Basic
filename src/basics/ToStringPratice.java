package basics;

public class ToStringPratice {

	
	int studentId;
	String name;
	
	ToStringPratice (int studentId, String name){
		this.studentId = studentId;
		this.name = name;
		
	}
	
	public String toString() {
		return studentId + " " + name;
	}
	
	
}
