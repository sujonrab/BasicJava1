package abstraction;

public abstract class MobileUser 

{
	void  call() {				// Non abstract method
		
		System.out.println("Call Method");
	}
	
	abstract void sendMessage();  // abstract method

}
