package bankExample;

public class Customer {

	
	private String fullName;
	private String phoneNumber;
	private String address;
	private String email;
	private double balance;
	private String dob;
	private String pin;
	int accNumber;
	public double checkBalance(String providePIN) {
		if(pin.equals(providePIN)) {
			System.out.println("Your Balance is $" + balance);
			return balance;
		}else {
			System.out.println("Incorrect PIN");
			return -1;
		}
	}
	
	public boolean deposit(double amount, int accNumber, String pin) {
		if(this.accNumber != accNumber || ! this.pin.equals(pin)) {
			System.out.println("Incorrect Credentials");
			return false;
			
		}
		this.balance += amount;
		System.out.println("$" + amount + "has been deposited to your account");
		return true;
	}
	
	
	
	public String getFullName() {
		return fullName;
		
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
	return address;
	}
	public String getEmail() {
		return email;
	}
	public String getDob() {
		return dob;
	}
	public int getAccNumber() {
		return accNumber;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDob(String dob) {
		this.dob = dob;
		
	}
	
	
	
	public Customer() {
		
		this.fullName = "";
		this.phoneNumber = "";
		this.address = "";
		this.email = "";
		this.balance = 0;
		this.dob = "";
		this.pin = "";
		this.accNumber = 0;
		
		
	}
	public Customer(String fullName, String phoneNumber, String address, String email, String dob, String pin, int accNumber) {
		
	
	
	this.fullName = fullName;
	this.phoneNumber = phoneNumber;
	this.address = address;
	this.email = email;
	this.dob = dob;
	this.pin = pin;
	this.accNumber = accNumber;
	
	this.balance = 0;
	
	}
	
	public String toString() {
		
		String temp ="---------------------------------------------\n" 
		+ "Customer Account#: " + accNumber + "    Balance: $ " + balance + "\n"
		+ "Full Name: " + fullName + "DOB: " + dob + "\n"
		+ "Address: " + address + "Email: " + email + "Phone Number : " + phoneNumber + "\n"
		+ "---------------------------------------------------------";
		return temp;
	}
	
	
	
}
