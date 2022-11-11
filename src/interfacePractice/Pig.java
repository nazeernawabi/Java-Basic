package interfacePractice;

public class Pig implements Animal{

	@Override
	public void animalSound() {
		System.out.println("Pig does wee wee wee");
		
	}

	@Override
	public void animalSleep() {
		System.out.println("Zzzzz");
		
	}
	public static void main(String[] args) {
		
		
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.animalSleep();
		
		
	}
}