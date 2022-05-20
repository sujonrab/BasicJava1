package abstraction;

public class Test {

	public static void main(String[] args) {
		
		MobileUser mu; // reference variable
		
		mu = new Sujon();
		mu.call();
		mu.sendMessage();
		
		mu = new Natasha();
		mu.sendMessage();

	}
 
}
